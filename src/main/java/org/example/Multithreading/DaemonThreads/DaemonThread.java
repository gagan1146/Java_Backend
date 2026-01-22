package org.example.Multithreading.DaemonThreads;

public class DaemonThread extends Thread {
    public DaemonThread(String normalThread) {
    }

    @Override
    public void run() {
        for(int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName() + "Hello World");
        }
        System.out.println("One task completed"+Thread.currentThread().getName() );
    }

    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Test("Normal Thread "));
        Thread t2 = new Thread(new DaemonThread("Daemon Thread "));
        t1.setName("Normal Thread ");
        t2.setName("Daemon Thread ");
        t1.setDaemon(true);
        Thread.yield();
        t2.start();
        t1.start();
        System.out.println("Main Done");
    }
}
