package org.example.Annotations.DeprecatedAnnotation;

@Deprecated
class A{
    void play(){
        System.out.println("Inside A play() method");
    }
}

class B extends A {
    void play(){
        System.out.println("Inside B play() method");
    }
}

public class DeprecatedAnnotationExample {
    static void main(String[] args) {
        B obj = new B();
        A obj1 = new B();
        A obj2 = new A();
        obj.play();
        obj1.play();
        obj2.play();
        // The code works but the compiler gives an warning that the class A is deprecated
        // This code also does not gives any error or exception
    }
}
