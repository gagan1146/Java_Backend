package org.example.Multithreading.Locks.ReenterantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    private int balance;
    private final Lock lock = new ReentrantLock();
    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void Withdraw(int amount) throws Exception {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amount);
        if(lock.tryLock(4000, TimeUnit.MILLISECONDS)){
            lock.lock();
            if(amount<=balance){
                balance-=amount;
                System.out.println(Thread.currentThread().getName() + " is successfully withdraw " + amount);
            }
            else{
                System.out.println(Thread.currentThread().getName() + " is failed to withdraw " + amount);
            }
            lock.unlock();
        }
        else{
            System.out.println("It is busy....");
        }
    }
}


public class ReenterantLockExample2 {
    static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(100);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    account.Withdraw(50);
                } catch (Exception e) {
                }
            }
        };
        Thread t1 = new Thread(task,"John");
        Thread t2 = new Thread(task,"Rock");
        Thread t3 = new Thread(task,"Brock");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Balance of account after performing these 3 transactions is " + account.getBalance());
    }
}
