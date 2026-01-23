
package org.example.CollectionFramework.Queue.QueueClassImplementation;

import org.example.DataBase.Student;

import java.util.Queue;

public class UseOfQueueClass {
    public Queue<Student> q;

    public UseOfQueueClass(Queue<Student> q) {
        this.q = q; // initialize the queue
    }

    public void Add(Student s) {
        q.add(s); // add the element in the queue
    }

    public boolean Contains(Student s) {
        return q.contains(s); // checks whether element exists or not
    }

    public void Remove() {
        q.remove(); // throws exception if empty
    }

    public void Poll() {
        q.poll(); // does not throw exception even if empty
    }

    public Student Peek() {
        return q.peek(); // does not throw exception even if empty
    }

    public Student Element() {
        return q.element(); // throws exception if empty
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Student s : q) {
            res.append(" [ Name : ").append(s.name)
                    .append(" & Age : ").append(s.age).append(" ] ->");
        }
        return "The Queue is : " + res;
    }
}