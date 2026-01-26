package com.Autowiring.JavaBased.pojo;

public class ParentalInformation {
    private String FatherName;
    private String MotherName;
    private int MotherAge;
    private int FatherAge;
    private String FatherAadharNumber;
    private String MotherAadharNumber;

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public void setMotherAge(int motherAge) {
        MotherAge = motherAge;
    }

    public void setFatherAge(int fatherAge) {
        FatherAge = fatherAge;
    }

    public void setFatherAadharNumber(String fatherAadharNumber) {
        FatherAadharNumber = fatherAadharNumber;
    }

    public void setMotherAadharNumber(String motherAadharNumber) {
        MotherAadharNumber = motherAadharNumber;
    }

    @Override
    public String toString() {
        return "ParentalInformation{" +
                "FatherName='" + FatherName + '\'' +
                ", MotherName='" + MotherName + '\'' +
                ", MotherAge=" + MotherAge +
                ", FatherAge=" + FatherAge +
                ", FatherAadharNumber='" + FatherAadharNumber + '\'' +
                ", MotherAadharNumber='" + MotherAadharNumber + '\'' +
                '}';
    }
}
