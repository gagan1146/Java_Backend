package org.example.Multithreading.Priority.DefaultPriority;

public class Main extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
    }

    static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread t1 = new Thread(new Main());
            t1.start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
