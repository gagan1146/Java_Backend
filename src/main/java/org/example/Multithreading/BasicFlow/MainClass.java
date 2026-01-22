package org.example.Multithreading.BasicFlow;

public class MainClass {
    void sayHello(){
        System.out.println("Hello From Main Class");
        System.out.println("Thread is of main Class : " + Thread.currentThread().getName());
    }
    static void main(String[] args) {
        new MainClass().sayHello();
        new ClassA().sayHello();
        new ClassB().sayHello();
    }
}
