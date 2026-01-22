package org.example.Multithreading.DaemonThreads;

public class Test extends Thread{
    public Test(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(;;){
            System.out.println(Thread.currentThread().getName() + "Hello");
        }
    }
}
