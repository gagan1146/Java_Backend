package org.example.Java8.LambdaFunction.WithLambdaExpression;


public class ExampleWithLambda {
    static void main(String[] args) {
        Thread t1 = new Thread(()->{
        System.out.println("I am Inside A Run Method With Using Lambda Expression...");
        });
        t1.start();
        Thread t2 = new Thread(()->System.out.println("I am Inside A Run Method With Using Lambda Expression..."));
        t2.start();
    }
}
