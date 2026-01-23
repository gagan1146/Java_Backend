package org.example.Multithreading.ProcessStates;

public class Runnable extends Thread{
    @Override
    public void run() {
        System.out.println("Run method of main");
    }

    static void main(String[] args) {
        Thread t1 = new Thread(new Runnable());
        t1.start();
        System.out.println(t1.getState());
        //as the process is started and hence in RUNNABLE state
    }
}
