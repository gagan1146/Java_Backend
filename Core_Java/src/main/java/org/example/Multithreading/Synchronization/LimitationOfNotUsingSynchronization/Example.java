package org.example.Multithreading.Synchronization.LimitationOfNotUsingSynchronization;

class BankAccount{
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void Withdraw(int amount) throws Exception {
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

public class Example{


    static void main(String[] args) {
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
//        t1.start();      // cant call again as it gives
        System.out.println("Balance of account after performing these 4 transactions is " + account.getBalance());
    }
}
