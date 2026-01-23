package org.example.Multithreading.ProcessStates;

public class TeminatedState extends Thread {
    @Override
    public void run() {
        System.out.println();
    }

    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TeminatedState());
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}
