package org.example.Multithreading.ProcessStates;

public class NewState extends Thread{

    @Override
    public void run() {
        System.out.println("I am inside the run method of NewState...");
    }

    static void main(String[] args) {
        NewState newState = new NewState();
        Thread t1 = new Thread(newState);
        System.out.println(t1.getState());
        // As the current thread is not executed, hence its in NEW State
    }
}
