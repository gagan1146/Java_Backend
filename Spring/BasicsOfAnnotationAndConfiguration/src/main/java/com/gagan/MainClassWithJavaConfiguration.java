package com.gagan;

import com.gagan.config.SpringConfigFile;
import com.gagan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassWithJavaConfiguration {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
