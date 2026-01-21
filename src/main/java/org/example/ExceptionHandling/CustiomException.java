package org.example.ExceptionHandling;

public class CustiomException extends  Exception{
    public CustiomException(String message, int amount, int balance) {
        super(message+" "+(amount-balance) + "rupees");
    }
}
