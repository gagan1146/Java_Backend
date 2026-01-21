package org.example.ExceptionHandling;

public class Account {
    private  int balance;
    public Account(int balance) {
        this.balance=balance;
    }
    public void withDraw(int amount) throws CustiomException {
        if(amount>balance){
            throw new CustiomException("Insufficient Balance ",amount,balance);
        }
    }
}

