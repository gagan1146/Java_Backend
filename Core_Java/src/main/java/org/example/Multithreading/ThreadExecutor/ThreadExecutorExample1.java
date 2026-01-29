package org.example.Multithreading.ThreadExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecutorExample1 {
    public static long factorial(int i) throws InterruptedException {
        Thread.sleep(1000);
        long res = 1;
        for (int x = 1; x <= i; x++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<Long>> futures = new ArrayList<>();
        long currentTime = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            Future<Long> future = executor.submit(() -> factorial(finalI));
            futures.add(future);
        }

        for (int i = 1; i <= 10; i++) {
            long result = futures.get(i - 1).get();
            System.out.println("Factorial of " + i + " = " + result);
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - currentTime) + " ms");
    }
}
