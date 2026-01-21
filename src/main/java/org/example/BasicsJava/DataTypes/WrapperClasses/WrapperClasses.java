package org.example.BasicsJava.DataTypes.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer a = 10;
        Double b = 20.5;
        Character c = 'Z';
        Boolean d = true;
        int x = a;
        double y = b;
        System.out.println("Integer object: " + a);
        System.out.println("Double object: " + b);
        System.out.println("Character object: " + c);
        System.out.println("Boolean object: " + d);
        System.out.println("Unboxed int: " + x);
        System.out.println("Unboxed double: " + y);
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
        System.out.println("Double MIN: " + Double.MIN_VALUE);
        System.out.println("Parse int: " + Integer.parseInt("123"));
        System.out.println("Parse double: " + Double.parseDouble("5.67"));
    }
}
