
package org.example.InnerClassesPackage;

public class InnerClasses {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Member Inner Class Is Used Here");
        System.out.println("----------------------------------------------------");

        MemberInnerClasses m1 = new MemberInnerClasses("Fortuner", "Toyota");
        MemberInnerClasses m2 = new MemberInnerClasses("XUV700", "Mahindra");

        System.out.println("----------------------------------------------------");
        m1.car.showDetails();
        m2.car.showDetails();

        System.out.println("----------------------------------------------------");
        m1.car.getEngine().start();
        m1.car.getEngine().stop();

        System.out.println("----------------------------------------------------");
        m2.car.getEngine().start();
        m2.car.getEngine().stop();
        m2.car.getEngine().stop(); // Already stopped — shows condition working

        System.out.println("----------------------------------------------------");
    }
}