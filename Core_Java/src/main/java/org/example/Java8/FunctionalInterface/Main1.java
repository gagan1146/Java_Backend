package org.example.Java8.FunctionalInterface;

interface Parent{
//    public void sayHello();
}

interface Parent2{
//    public void sayHello();
}

@FunctionalInterface
interface MyInterface1 extends Parent,Parent2{
    public void say();
    public static void say1(){

    }public static void say2(){

    }public default void say4(){

    }public default void say5(){

    }
}

public class Main1 {

}
