package org.gagan.springbootlearning.AnnotationSpringBoot.AsyncAnnotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/async/")
public class ClassA {
    @Autowired
    private final ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    @GetMapping("/getUserA")
    public String getUserA() {
        String curThread = "Inside Class A, Thread Name : " + Thread.currentThread().getName();
        System.out.println(curThread);
        classB.getUserB();
        return "Triggered async call";
    }
}
