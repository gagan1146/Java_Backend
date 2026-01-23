package org.example.BasicsJava.MathematicalOperations;

public class ArithmeticOperators {
    static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a + b, d = a * b, e = a / b, f = a % b, g = a - f, val;
        try{
            val = a/0;
        }
        catch(ArithmeticException ex){
            System.out.println("The error is : " + ex);
            val = -1;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " Value of val is : " + val + " ");
        byte byt = 10;
        System.out.println(byt);
        byt = (byte) (byt + 5);
        System.out.println(byt);
        byt = (byte) (byt + byt);
        System.out.println(byt);
        int byti = (byt + 5);
        System.out.println(byti);
        int incPost = 11;
        System.out.println(incPost++);
        int incPre = 11;
        System.out.println(++incPre);
        int decPre = 11;
        System.out.println(--decPre);
        int decPost = 11;
        System.out.println(decPost--);
        System.out.println(decPre+ " " + decPost + " " + incPost + " " + incPre);
        int usePreInc = ++incPre + incPre;
        int usePostInc = incPost++ + incPost;
        int usePostDec = decPost-- + decPost;
        int usePreDec = --decPre + decPre;
        System.out.println(decPre+ " " + decPost + " " + incPost + " " + incPre);
        System.out.println(usePostDec + " " + usePreDec +  " " + usePostInc + " " + usePreInc);
    }
}
