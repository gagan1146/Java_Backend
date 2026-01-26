package com.dependency.Constructor.UsingXML.pojo;



public class Student {
    private String name;
    private int rollno;
    private Address address;

    public Student(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public void display(){
        System.out.println("[ " + this.name + this.rollno  + " ]");
        address.display();
    }
}
