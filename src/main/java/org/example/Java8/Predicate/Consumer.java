package org.example.Java8.Predicate;

public class Consumer {
    static void main(String[] args) {
        java.util.function.Consumer<String> consumer = (x)->System.out.println(x.toUpperCase());
         consumer.accept("hello");
    }
}
