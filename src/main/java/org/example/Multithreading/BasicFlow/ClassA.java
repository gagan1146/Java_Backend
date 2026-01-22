package org.example.Multithreading.BasicFlow;

public class ClassA {
    public void sayHello(){
        System.out.println("Hello From A");
        System.out.println("Thread is of : " + Thread.currentThread().getName());
    }
}
