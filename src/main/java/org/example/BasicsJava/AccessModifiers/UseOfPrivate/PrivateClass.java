package org.example.BasicsJava.AccessModifiers.UseOfPrivate;

class Animal{
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class PrivateClass {
    static void main(String[] args) {
        Animal animal = new Animal(60,"Dog");
//        animal.age=30;
//        animal.name="Cat";
//        System.out.println(animal.age + " " + animal.name);
        // not accessible as its a private
    }
}
