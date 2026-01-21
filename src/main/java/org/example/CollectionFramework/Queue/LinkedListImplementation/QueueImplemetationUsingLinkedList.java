package org.example.CollectionFramework.Queue.LinkedListImplementation;

import org.example.DataBase.Student;

import java.util.LinkedList;

public class QueueImplemetationUsingLinkedList {
    private Student student;
    private LinkedList<Student> studentLinkedList;
    public QueueImplemetationUsingLinkedList(){
        this.studentLinkedList = new LinkedList<>();
    }
    public QueueImplemetationUsingLinkedList(Student student) {
        this.student = student;
        this.studentLinkedList = new LinkedList<>();
        studentLinkedList.addFirst(student);
    }

    public void add(Student s){
        studentLinkedList.addLast(s);
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
        return "The Queue is : " + res;
    }
}
