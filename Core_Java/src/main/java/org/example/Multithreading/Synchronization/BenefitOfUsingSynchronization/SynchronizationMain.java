package org.example.Multithreading.Synchronization.BenefitOfUsingSynchronization;

public class SynchronizationMain {
    static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyThread(counter));
        Thread t2 = new Thread(new MyThread(counter));
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }
}
