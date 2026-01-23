package org.example.Java10_17_Features.RecordClasses.WithUsingRecordKeyword;

record Alien(int id, String name){}

public class RecordKeywordExample1 {
    static void main(String[] args) {
        Alien alien1 = new Alien(1, "Jadu");
        Alien alien2 = new Alien(1, "Jadu");
        System.out.println(alien2.equals(alien1));
    }
}

