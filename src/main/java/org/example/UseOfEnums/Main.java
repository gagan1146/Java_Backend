
package org.example.UseOfEnums;

import org.example.ExceptionHandling.Account;
import org.example.ExceptionHandling.CustiomException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

enum Operation {
    MONDAY, TUESDAY, WEDNESDAY;

    // --------- For Numbers (int, double both work) ---------
    public void apply(Number a, Number b) {
        double x = a.doubleValue();
        double y = b.doubleValue();

        switch (this) {
            case MONDAY:
                System.out.println(x + y);
                break;

            case TUESDAY:
                System.out.println(x - y);
                break;

            case WEDNESDAY:
                System.out.println(x * y);
                break;
        }
    }

    // --------- For Strings ---------
    public void apply(String a, String b) {
        switch (this) {
            case MONDAY:
                System.out.println(a + b);
                break;

            case TUESDAY:
                System.out.println("String subtraction not supported");
                break;

            case WEDNESDAY:
                // repeat string 'a' b times (if b is a number)
                try {
                    int times = Integer.parseInt(b);
                    System.out.println(a.repeat(times));
                } catch (Exception e) {
                    System.out.println("Enter a number for repetition");
                }
                break;
        }
    }
}

interface Animal{
     void getSound();
     void getName();
}


class Dog implements Animal{

        @Override
    public void getSound(){
        System.out.println("Dog Sound");
    }
    public void getName(){
        System.out.println("Base Class Name..");
    }
}

public class Main {
    public static void main(String[] args) throws CustiomException,Exception {
        Operation.MONDAY.apply(10, 20);        // int
        Operation.TUESDAY.apply(10.5, 2.5);    // double
        Operation.MONDAY.apply("Hello ", "World"); // string
        Operation.WEDNESDAY.apply("Hi", "3");      // "HiHiHi"
        System.out.println("----------------------------------------------");
        Animal a = new Dog();
        a.getSound();
        a.getName();
        System.out.println("----------------------------------------------");
        try (FileReader f = new FileReader("C:\\Users\\gagsharm\\OneDrive - Ciena Corporation\\Desktop\\Java_Practice\\Java-core\\Java-Core-Practice\\src\\main\\java\\org\\example\\UseOfEnums\\abc.txt")) {
            int ch;
            while ((ch = f.read()) != -1) {
                System.out.print((char)ch);
            }
            System.out.println("----------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } finally {
            System.out.println("Finally Statement..");
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("Run by throws");
        try{
            Account account = new Account(100);
            account.withDraw(101);
        }
        catch(CustiomException e){
            System.out.println(e);
        }
        System.out.println("----------------------------------------------");
    }
}
