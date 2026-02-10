package org.example.Multithreading.CommonPracticeMultithreading;

class Worker extends Thread {
    private int id;
    public Worker(int id) {
        this.id = id;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker " + id + " iteration " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class Task implements Runnable {
    private String name;
    public Task(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Task " + name + " step " + i);
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {}
        }
    }
}

class SharedResource {
    private int count = 0;
    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " incremented count to " + count);
    }
    public synchronized int getCount() {
        return count;
    }
}

class ResourceWorker extends Thread {
    private SharedResource resource;
    private String name;
    public ResourceWorker(SharedResource resource, String name) {
        this.resource = resource;
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 20; i++) {
            resource.increment(name);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        Worker w1 = new Worker(1);
        Worker w2 = new Worker(2);
        Worker w3 = new Worker(3);
        w1.start();
        w2.start();
        w3.start();

        Thread t1 = new Thread(new Task("A"));
        Thread t2 = new Thread(new Task("B"));
        Thread t3 = new Thread(new Task("C"));
        t1.start();
        t2.start();
        t3.start();

        SharedResource resource = new SharedResource();
        ResourceWorker rw1 = new ResourceWorker(resource, "RW1");
        ResourceWorker rw2 = new ResourceWorker(resource, "RW2");
        ResourceWorker rw3 = new ResourceWorker(resource, "RW3");
        rw1.start();
        rw2.start();
        rw3.start();

        try {
            w1.join();
            w2.join();
            w3.join();
            t1.join();
            t2.join();
            t3.join();
            rw1.join();
            rw2.join();
            rw3.join();
        } catch (InterruptedException e) {}

        System.out.println("Final count: " + resource.getCount());
    }
}


