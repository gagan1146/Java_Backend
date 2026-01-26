package com.dependency.Setter.UsingXML.pojo;

public class Student {
    private String name;
    private int rollno;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void display(){
        System.out.println("[ " + this.name + this.rollno  + " ]");
        address.display();
    }
}
