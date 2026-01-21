package org.example.BasicsJava.OOPS.Abstraction;

abstract class Animal {
    public static final int MAX_AGE = 150;
    private int age;

    public int getAge() {
        return age;
    }

    public Animal(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract void getSound();
//    void sleep();
    public static void info(){
        System.out.println("This is a Static Method inside the Abstract Class");
    }
    public void AbstractMethods(){
        System.out.println("I am inside Abstract Method");
    }
//    public default void run(){
//        System.out.println("Animal is running");
//    }
}

public class Abstraction extends Animal {
    public Abstraction(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void getSound() {
        System.out.println("Animal is giving Sound");
    }

    public static void main(String[] args) {
        Abstraction obj = new Abstraction(60);
        obj.eat();
        obj.getSound();
        Animal.info();
        System.out.println("Max Age: " + Animal.MAX_AGE);
        obj.AbstractMethods();
        obj.getAge();
//        Animal animal = new Animal();
        Animal cus = new Abstraction(55);
        cus.AbstractMethods();
        cus.getAge();
        cus.getSound();
    }
}
