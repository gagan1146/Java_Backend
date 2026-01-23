package org.example.Java8.FunctionalInterface;

// Functional Interface can have any number of static and default methods but only one abstract method...

@FunctionalInterface
interface MyInterface{
    public void say();
    public static void say1(){

    }public static void say2(){

    }public static void say3(){

    }public default void say4(){

    }public default void say5(){

    }public default void say6(){

    }
}

public class Main {
}
