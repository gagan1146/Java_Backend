package org.gagan.learningspringbeanlifecycle.BeanLifeCycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String email;
    private int age;
    private String accno;
    private Parent parent;

    public User(@Value("${user.name}") String name,
                @Value("${user.email}") String email,
                @Value("${user.age}") int age,
                @Value("${user.accno}") String accno,
                Parent parent) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.accno = accno;
        this.parent = parent;
    }
}
