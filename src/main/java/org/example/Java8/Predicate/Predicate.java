package org.example.Java8.Predicate;


public class Predicate {
    static void main(String[] args) {
        int x2 = 100;
        java.util.function.Predicate<Integer> predicate = x1->x1%2==0;
        System.out.println(x2+ " " + predicate.test(x2));
    }
}
