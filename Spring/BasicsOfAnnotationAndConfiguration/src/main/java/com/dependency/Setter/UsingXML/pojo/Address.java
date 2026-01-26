package com.dependency.Setter.UsingXML.pojo;

public class Address {
    private String area;
    private String city;
    private int pincode;

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void display(){
        System.out.println("[ " + this.area + " " + this.city + " " + this.pincode + " ]");
    }
}
