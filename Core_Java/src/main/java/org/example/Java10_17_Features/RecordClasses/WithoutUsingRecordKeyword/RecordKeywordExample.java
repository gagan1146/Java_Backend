package org.example.Java10_17_Features.RecordClasses.WithoutUsingRecordKeyword;

import java.util.Objects;

class Alien{
    private final int id;
    private final String name;
    public Alien(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return id == alien.id && Objects.equals(name, alien.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class RecordKeywordExample {

    static void main(String[] args) {
        Alien alien1 = new Alien(1,"Jadu");
        Alien alien2 = new Alien(1,"Jadu");
        System.out.println(alien2.equals(alien1));
    }
}
