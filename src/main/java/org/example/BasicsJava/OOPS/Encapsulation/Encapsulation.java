package org.example.BasicsJava.OOPS.Encapsulation;

class Student {
    private String name;  // private variable
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Gagan");
        s.setAge(22);
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}
