package org.example.Multithreading.Methods;

public class Start extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Join());
        t1.start();
        System.out.println("Executed immediately... because of this start method.....");
    }
}
