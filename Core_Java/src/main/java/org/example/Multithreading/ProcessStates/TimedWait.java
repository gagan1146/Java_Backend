package org.example.Multithreading.ProcessStates;

import java.lang.Runnable;

public class TimedWait implements Runnable {
    @Override
    public void run() {
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TimedWait());
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}
