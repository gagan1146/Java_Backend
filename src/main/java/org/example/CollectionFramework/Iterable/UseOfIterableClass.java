package org.example.CollectionFramework.Iterable;

import org.example.DataBase.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterableClass {
    public Iterable<Student> iterable;

    public UseOfIterableClass(Iterable<Student> iterable) {
        this.iterable = iterable; // initialize iterable
    }

    public boolean Contains(Student s) {
        for (Student st : iterable) {
            if (st.equals(s)) return true;
        }
        return false;
    }

    public boolean Contains1(Student s) {
        Iterator<Student> it = iterable.iterator();
        while(it.hasNext()) {
            Student current = it.next();
            if (current.equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Student s : iterable) {
            res.append(" [ Name : ").append(s.name)
                    .append(" & Age : ").append(s.age).append(" ] ->");
        }
        return "The Iterable is : " + res;
    }

    static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s2 = new Student("Grace", 34);
        studentList.add(new Student("Grace", 24));
        studentList.add(new Student("Hank", 26));
        studentList.add(s2);
        UseOfIterableClass iterableExample = new UseOfIterableClass(studentList);
        System.out.println(iterableExample);
        System.out.println(iterableExample.Contains(new Student("Grace", 24)));
        System.out.println(iterableExample.Contains(s2));
        System.out.println(iterableExample.Contains1(new Student("Grace", 24)));
        System.out.println(iterableExample.Contains1(s2));
    }
}

