package com.gagan;

import com.gagan.config.SpringConfigFile;
import com.gagan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassWithAnnotationByUsingXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
        Student std1 = (Student) context.getBean("student");
        System.out.println(std1);
    }
}
