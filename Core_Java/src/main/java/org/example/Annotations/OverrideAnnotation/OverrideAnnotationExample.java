package org.example.Annotations.OverrideAnnotation;

class A{
    void play(){
        System.out.println("Inside A play() method");
    }
}

class B extends A{
    @Override
    void play(){
        System.out.println("Inside B play() method");
    }
}

public class OverrideAnnotationExample {
    static void main(String[] args) {
        B obj = new B();
        A obj1 = new B();
        A obj2 = new A();
//        B obj3 = new A();
// This above line gives an error because There can be some methods in B that are not present in A
        obj.play();
        obj1.play();
        obj2.play();
    }
}
