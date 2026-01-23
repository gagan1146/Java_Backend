package org.example.Java8.LambdaFunction.WithoutLambdaExpression;

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}


public class AnotherExampleWithoutLambdaFunction implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a+b;
    }

    static void main(String[] args) {
        MathOperation operation = new AnotherExampleWithoutLambdaFunction();
        System.out.println(operation.operate(10,20));
    }
}
