package com.dependency.Constructor.UsingXML.MainClassFiles;

import com.dependency.Constructor.UsingXML.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassConstructorDependency {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DependencyConstructorConfiguration.xml");
        Student stdId1 = (Student) applicationContext.getBean("stdId1");
        stdId1.display();
    }
}
