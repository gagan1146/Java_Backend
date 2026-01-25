package org.example.Java10_17_Features.VarKeyword;

import org.example.DataBase.Student;

// class cannot be created by identifier as var

//class var{
//
//}

// var cannot be used in place of class keyword

//var Alien{
//int a;
//int b;
//}

public class VarExample1 {
    static void main(String[] args) {
        int a = 10;
        var b = 10;
        int c;
//        var d;   // must be initialized
        int arr[] = {10,20,2,3,234};
        var arr1 = new int[]{10, 20, 3, 23, 232};
        var arr2 = new int[10];
        var var = 35;
        Student s = new Student("John",30);
        var s1 = new Student("Harsh",32);
    }
}
