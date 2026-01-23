package org.example.BasicsJava.Interface;

interface Animal{
    public static final int MAX_AGE = 150;
    public abstract void eat();
    public abstract void getSound();
    void sleep();
    public static void info(){
        System.out.println("This is a Static Method inside the Interface");
    }
    public default void run(){
        System.out.println("Animal is running");
    }
}

public class Interfaces {
    public Dog dog;
    private Cat cat;

    public Interfaces() {
        this.dog = new Dog();
    }

    private class Dog implements Animal {
        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }

        @Override
        public void getSound() {
            System.out.println("Dog is Barking");
        }

        @Override
        public void sleep() {
            System.out.println("Dog is sleeping");
        }
    }

    private class Cat implements Animal {
        @Override
        public void eat() {
            System.out.println("Cat is eating");
        }

        @Override
        public void getSound() {
            System.out.println("Cat is meow");
        }

        @Override
        public void sleep() {
            System.out.println("Cat is sleeping");
        }
    }

    static void main(String[] args) {
        Interfaces.Dog dog = new Interfaces().new Dog();
        Cat cat = new Interfaces(). new Cat();

        dog.eat();
        dog.getSound();
        dog.sleep();
        System.out.println(dog.MAX_AGE);
        System.out.println( new Interfaces(). new Cat().MAX_AGE);
//        new Interfaces().dog.info();
        cat.run();
        System.out.println("--------------------------------");
        cat.eat();
        cat.getSound();
        cat.sleep();
        System.out.println(Animal.MAX_AGE);
        Animal.info();
        System.out.println("--------------------------------");
    }
}
