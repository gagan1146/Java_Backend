package org.example.Java8.Predicate;

public class Supplier {
    static void main(String[] args) {
        int x1 = 100;
        java.util.function.Supplier<Integer> sup = ()->x1*x1;
        System.out.println(x1+ " " + sup.get());
    }
}
