package org.example.Multithreading.ConcurrentExecution.UsingThreadClass;

public class Main extends Thread {
    @Override
    public void run() {
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }

    static void main(String[] args) {
        Thread t1 = new Thread(new Main());
        Thread t2 = new Thread(new World());
//        t1.run();
//        t2.run();     // As these two commands will execute the statements normally
        // start() is used to perform multi threading
        t1.start();
        t2.start();
    }
}
