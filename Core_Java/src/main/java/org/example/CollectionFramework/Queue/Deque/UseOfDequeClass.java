package org.example.CollectionFramework.Queue.Deque;

import org.example.DataBase.Student;
import java.util.Deque;

public class UseOfDequeClass {
    public Deque<Student> dq;

    public UseOfDequeClass(Deque<Student> dq) {
        this.dq = dq; // initialize deque
    }

    public void AddFirst(Student s) {
        dq.addFirst(s);
    }

    public void AddLast(Student s) {
        dq.addLast(s);
    }

    public Student RemoveFirst() {
        return dq.removeFirst(); // throws exception if empty
    }

    public Student RemoveLast() {
        return dq.removeLast(); // throws exception if empty
    }

    public Student PeekFirst() {
        return dq.peekFirst(); // safe peek
    }

    public Student PeekLast() {
        return dq.peekLast(); // safe peek
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Student s : dq) {
            res.append(" [ Name : ").append(s.name)
                    .append(" & Age : ").append(s.age).append(" ] ->");
        }
        return "The Deque is : " + res;
    }
}
