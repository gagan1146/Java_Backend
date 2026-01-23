package org.example.Java8.LambdaFunction.WithoutLambdaExpression;

class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("I am Inside A Run Method Without Using Lambda Expression...");
    }
}

public class ExampleWithoutLambda {
    static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        t1.start();
    }
}
