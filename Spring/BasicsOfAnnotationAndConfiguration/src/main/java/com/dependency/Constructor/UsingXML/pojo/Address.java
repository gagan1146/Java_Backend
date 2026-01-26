package com.dependency.Constructor.UsingXML.pojo;

public class Address {
    private String area;
    private String city;
    private int pincode;

    public Address(String area, String city, int pincode) {
        this.area = area;
        this.city = city;
        this.pincode = pincode;
    }

    public void display(){
        System.out.println("[ " + this.area + " " + this.city + " " + this.pincode + " ]");
    }
}
