package org.example.Multithreading.Priority.SetPriority;

import java.util.ArrayList;

public class Main extends Thread{
    static void main(String[] args) throws InterruptedException {
        ArrayList< Thread> arrayList = new ArrayList<>();

        for(int i=1;i<5;i++){
            Thread t1 = new Thread(new Main() );
            try {
                t1.setPriority(i);
            } catch (Exception e) {
                System.out.println("e");
            }
            t1.setName("Main"+i);
            arrayList.add(t1);
        }
        for(int i=0;i<4;i++){
            System.out.println(arrayList.get(i).getName());
            System.out.println(arrayList.get(i).getPriority());
            arrayList.get(i).join();
        }

    }
}


//public class  Main {
//    public static void main(String[] args) {
//        // Create an ArrayList to store Thread objects
//        ArrayList<Thread> threadList = new ArrayList<>();
//
//        // Create and add threads to the list
//        for (int i = 1; i <= 5; i++) {
//            Thread t = new Thread(() -> {
//                System.out.println("Thread running: " + Thread.currentThread().getName());
//            }, "Thread-" + i);
//
//            threadList.add(t);
//        }
//
//        // Start all threads
//        for (Thread t : threadList) {
//            t.start();
//        }
//
//        // Optionally, wait for all threads to finish
//        for (Thread t : threadList) {
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("All threads have finished.");
//    }
//}
