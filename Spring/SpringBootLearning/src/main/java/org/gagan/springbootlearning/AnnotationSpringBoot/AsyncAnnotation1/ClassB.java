package org.gagan.springbootlearning.AnnotationSpringBoot.AsyncAnnotation1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ClassB {
    @Async
    public void getUserB() {
        String currThread = "Inside Class B, Thread name is : " + Thread.currentThread().getName();
        System.out.println(currThread);
    }
}
