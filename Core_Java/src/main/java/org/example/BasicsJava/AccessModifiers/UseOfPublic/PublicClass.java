package org.example.BasicsJava.AccessModifiers.UseOfPublic;

class Animal{
    public int age;
    public String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class PublicClass {
    static void main(String[] args) {
        Animal animal = new Animal(60,"Dog");
        animal.age=30;
        animal.name="Cat";
        System.out.println(animal.age + " " + animal.name);
        // always accessible and anywhere
    }
}
