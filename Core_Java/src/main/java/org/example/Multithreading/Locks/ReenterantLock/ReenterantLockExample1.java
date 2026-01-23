package org.example.Multithreading.Locks.ReenterantLock;

import org.example.DataBase.Student;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantLockExample1 {
    static void main() throws InterruptedException {
        Student s1 = new Student("Rock",40);
        Student s2 = new Student("John",32);
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("I am Using Lock " + Thread.currentThread().getName());
        });
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("I am Using Lock " + Thread.currentThread().getName());
        });
        lock.lock();
        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
            System.out.println("Lock Aquired Successfully..");
        }
        else{
            System.out.println("Not available..");
        }
        t1.start();
        t2.start();
        t1.join();
        lock.unlock();
        t2.join();
        System.out.println("Completed All processes......");
    }
}
