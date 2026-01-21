package org.example.BasicsJava.AccessModifiers.UseOfDefault;

class Animal{
    int age;
    String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class DefaultClass {
    static void main(String[] args) {
        Animal animal = new Animal(60,"Dog");
        animal.age=30;
        animal.name="Cat";
        System.out.println(animal.age + " " + animal.name);
        // can be accessible in the same package
    }
}
