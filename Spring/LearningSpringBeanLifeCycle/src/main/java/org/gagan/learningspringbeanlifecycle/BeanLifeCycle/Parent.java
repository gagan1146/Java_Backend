package org.gagan.learningspringbeanlifecycle.BeanLifeCycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parent {
    private String fatherName;
    private String motherName;

    public Parent(@Value("${parent.fatherName}") String fatherName,
                  @Value("${parent.motherName}") String motherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
    }
}
