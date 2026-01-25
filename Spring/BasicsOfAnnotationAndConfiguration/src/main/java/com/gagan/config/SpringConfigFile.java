package com.gagan.config;

import com.gagan.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean(name = "student")
    public Student Std1(){
        Student student = new Student();
        student.setId(101);
        student.setName("Jack");
        return student;
    }
}