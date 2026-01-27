package org.example.Multithreading.Locks.ReenterantLock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example2 {

    private final Lock lock = new ReentrantLock();

    public void OuterMethod(){
        lock.lock();
        try{
            System.out.println("Inside Outer Method...");
            InnerMethod();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            lock.unlock();
        }
    }
    public void InnerMethod(){
        lock.lock();
        try{
            System.out.println("Inside Inner Method...");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            lock.unlock();
        }
    }

    static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.OuterMethod();
        example2.InnerMethod();
    }
}
