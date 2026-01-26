package com.Autowiring.JavaBased.pojo;

public class Users {
    private String username;
    private String AadharNumber;
    private int age;
    private String PANNumber;
    private String image;
    private Address address;
    private ParentalInformation parentalInformation;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAadharNumber(String aadharNumber) {
        AadharNumber = aadharNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPANNumber(String PANNumber) {
        this.PANNumber = PANNumber;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setParentalInformation(ParentalInformation parentalInformation) {
        this.parentalInformation = parentalInformation;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", AadharNumber='" + AadharNumber + '\'' +
                ", age=" + age +
                ", PANNumber='" + PANNumber + '\'' +
                ", image='" + image + '\'' +
                ", address=" + address +
                ", parentalInformation=" + parentalInformation +
                '}';
    }
}
