package org.example.CollectionFramework.Queue.PriorityQueue;

import org.example.DataBase.Student;

import java.util.PriorityQueue;

public class UseOfPriorityQueueClass {
    public PriorityQueue<Student> pq;

    public UseOfPriorityQueueClass(PriorityQueue<Student> pq) {
        this.pq = pq; // initialize the priority queue
    }

    public void Add(Student s) {
        pq.add(s); // add element
    }

    public boolean Contains(Student s) {
        return pq.contains(s);
    }

    public void Remove() {
        pq.remove(); // throws exception if empty
    }

    public void Poll() {
        pq.poll(); // safe removal
    }

    public Student Peek() {
        return pq.peek(); // safe peek
    }

    public Student Element() {
        return pq.element(); // throws exception if empty
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Student s : pq) {
            res.append(" [ Name : ").append(s.name)
                    .append(" & Age : ").append(s.age).append(" ] ->");
        }
        return "The PriorityQueue is : " + res;
    }
}