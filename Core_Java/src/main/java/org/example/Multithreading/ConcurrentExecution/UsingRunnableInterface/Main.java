package org.example.Multithreading.ConcurrentExecution.UsingRunnableInterface;

public class Main implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<1000000;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    static void main(String[] args) {
        Main main = new Main();
        World world = new World();
        Thread t1 = new Thread(main);
        Thread t2 = new Thread(world);
        t1.start();
        t2.start();
    }
}
