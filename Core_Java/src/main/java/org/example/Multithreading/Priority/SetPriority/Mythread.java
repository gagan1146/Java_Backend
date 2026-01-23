package org.example.Multithreading.Priority.SetPriority;

public class Mythread  implements Runnable {
    private Thread value;



    @Override
        public void run() {
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName());
        }

    }
