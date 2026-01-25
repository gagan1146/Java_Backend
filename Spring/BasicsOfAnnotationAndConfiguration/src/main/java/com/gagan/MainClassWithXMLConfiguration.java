package com.gagan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gagan.pojo.Student;

public class MainClassWithXMLConfiguration {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = (Student) context.getBean("studentBean1");
        Student student2 = (Student) context.getBean("studentBean2");

        System.out.println(student1);
        System.out.println(student2);
    }
}