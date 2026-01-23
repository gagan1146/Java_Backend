package org.example.Multithreading.Locks;


class BankAccount{
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void Withdraw(int amount) throws Exception {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amount);
        if(amount<=balance){
            Thread.sleep(5000);
            balance-=amount;
            System.out.println(Thread.currentThread().getName() + " is successfully withdraw " + amount);
        }
        else{
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is failed to withdraw " + amount);
        }
    }
}


public class LockExample1 {
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
