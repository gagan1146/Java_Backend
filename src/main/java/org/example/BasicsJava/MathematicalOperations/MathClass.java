package org.example.BasicsJava.MathematicalOperations;

public class MathClass {
    static void main(String[] args) {
        int a = 10, b = 20;
        int c = Math.max(a,b);
        int d = Math.min(a,b);
        int e = Math.abs(-a);
        int f = (int) Math.ceil((2.43*a));
        int g = (int) Math.ceil((2.43*a));
        int h = (int) Math.pow(2,4);
        int i = Math.powExact(2,a);
        double j = Math.log(a);
        double k = Math.log10(a);
        double l = Math.PI;
        double m = Math.random();
        int n = (int) (Math.random()*b+1);  // between 1 and b
    }
}
