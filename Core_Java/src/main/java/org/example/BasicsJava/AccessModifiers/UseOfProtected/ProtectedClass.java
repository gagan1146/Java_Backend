package org.example.BasicsJava.AccessModifiers.UseOfProtected;

class Animal{
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class ProtectedClass {
    static void main(String[] args) {
        Animal animal = new Animal(60,"Dog");
        animal.age=30;
        animal.name="Cat";
        System.out.println(animal.age + " " + animal.name);
        // both are accessible as in the same package
    }
}
