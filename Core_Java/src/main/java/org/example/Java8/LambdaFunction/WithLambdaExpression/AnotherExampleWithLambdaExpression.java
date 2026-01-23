package org.example.Java8.LambdaFunction.WithLambdaExpression;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class AnotherExampleWithLambdaExpression {
    public static void main(String[] args) {
        MathOperation addition = Integer::sum;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> ( b != 0 ) ? a / b : 0;

        System.out.println("Addition: " + addition.operate(10, 20));
        System.out.println("Subtraction: " + subtraction.operate(10, 20));
        System.out.println("Multiplication: " + multiplication.operate(10, 20));
        System.out.println("Division: " + division.operate(20, 10));
    }
}