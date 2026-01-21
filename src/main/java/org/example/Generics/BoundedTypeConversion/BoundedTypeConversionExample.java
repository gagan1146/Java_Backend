package org.example.Generics.BoundedTypeConversion;

class NumberPrinter {
    // Bounded type parameter for generic constructor
    <T extends Number> NumberPrinter(T number) {
        System.out.println("Number: " + number);
    }
}

public class BoundedTypeConversionExample {
     static void main(String[] args) {
        new NumberPrinter(100);  // Integer is a subclass of Number
        new NumberPrinter(3.14);  // Double is a subclass of Number
        // new NumberPrinter("Hello");  // Gives an error as not a subclass of Number
    }
}
