package org.example.CollectionFramework.List.Stack;
import java.util.LinkedList;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class StackImplemetationUsingLinkedList {
    private Student student;
    private LinkedList<Student> studentLinkedList;
    public StackImplemetationUsingLinkedList(){
        this.studentLinkedList = new LinkedList<>();
    }
    public StackImplemetationUsingLinkedList(Student student) {
        this.student = student;
        this.studentLinkedList = new LinkedList<>();
        studentLinkedList.addFirst(student);
    }

    public void add(Student s){
        studentLinkedList.addFirst(s);
    }
    public void remove(){
        if(studentLinkedList.size()>0) studentLinkedList.removeFirst();
    }

    @Override
    public String toString() {
        String res = "";
        for(Student s: studentLinkedList){
            res += (" [ Name : " + s.name + " & Age : " + s.age+" ] ->");
        }
        return "The Stack is : " + res;
    }
}