package com.dependency.Setter.MainClassFiles;

import com.dependency.Setter.UsingXML.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassFile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DependencySetterConfiguration.xml");
        Student stdId1 = (Student) applicationContext.getBean("stdId1");
        stdId1.display();
    }
}
