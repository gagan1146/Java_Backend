package org.example.Multithreading.BasicFlow;

public class ClassB {
    public void sayHello(){
        System.out.println("Hello From B");
        System.out.println("Thread is of : " + Thread.currentThread().getName());
    }
}
