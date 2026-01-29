package org.example.Multithreading.ThreadPooling;

import java.util.ArrayList;
import java.util.List;

public class FactorialExample1WithoutThreadPooling {
    public static long factorial(int i) throws InterruptedException {
        Thread.sleep(1000); // simulate heavy computation
        long res = 1;
        for (int x = 1; x <= i; x++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        long currentTime = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            Thread t = new Thread(() -> {
                try {
                    long factorial = factorial(finalI);
                    System.out.println("Factorial of " + finalI + " = " + factorial);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(t);
            t.start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - currentTime) + " ms");
    }
}