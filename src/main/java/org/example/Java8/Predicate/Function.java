package org.example.Java8.Predicate;

public class Function {
    static void main(String[] args) {
        int x1 = 100;
        java.util.function.Function<Integer,Integer> double1 = (x)->x*x;
        int d = double1.apply(x1);
        System.out.println(x1+" "+d);
    }
}
