package org.example.Java10_17_Features.SealedClasses;

sealed class Z extends Thread permits A{

}

sealed class A extends Z permits B, C,D {
}

final class B extends A{
}

non-sealed class C extends A{
}

sealed class D extends A{
}

non-sealed class E extends D{

}

public class SealedClassExample1 extends C {
    public static void main(String[] args) {
        A obj1 = new B();
        A obj2 = new C();
        A obj3 = new D();
        A obj4 = new E();
        System.out.println("All sealed class hierarchy objects created successfully!");
    }
}
