package org.example.Multithreading.Synchronization;

public class Counter {
  private  int count = 0;
//    public void increment(){
//        count++;
//    }
//    public synchronized void increment(){
//        count++;
//    }
    public void increment(){
        synchronized(this){
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
