package org.example.CollectionFramework.Queue;

import org.example.CollectionFramework.Queue.Deque.UseOfDequeClass;
import org.example.CollectionFramework.Queue.LinkedListImplementation.QueueImplemetationUsingLinkedList;
import org.example.CollectionFramework.Queue.PriorityQueue.UseOfPriorityQueueClass;
import org.example.CollectionFramework.Queue.QueueClassImplementation.UseOfQueueClass;
import org.example.DataBase.Student;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class AllOperations {
    static void main(String[] args) {
        // FIFO
        QueueImplemetationUsingLinkedList queueImplemetationUsingLinkedList = new QueueImplemetationUsingLinkedList(new Student("Temp",101));
        queueImplemetationUsingLinkedList.add(new Student("UT",11));
        queueImplemetationUsingLinkedList.add(new Student("SK",10));
        queueImplemetationUsingLinkedList.add(new Student("GS",10));
        System.out.println(queueImplemetationUsingLinkedList);
        queueImplemetationUsingLinkedList.remove();
        System.out.println(queueImplemetationUsingLinkedList);

        System.out.println("------------------Use of Queue Built in class----------------");

        UseOfQueueClass useQueue = new UseOfQueueClass(new LinkedList<>());

        useQueue.Add(new Student("Alice", 21));
        useQueue.Add(new Student("Bob", 22));
        useQueue.Add(new Student("Charlie", 23));
        System.out.println(useQueue);

        System.out.println("Peek: " + useQueue.Peek().name);
        System.out.println("Contains Bob? " + useQueue.Contains(new Student("Bob", 22)));

        useQueue.Remove();
        System.out.println("After Remove: " + useQueue);

        useQueue.Poll();
        System.out.println("After Poll: " + useQueue);

        System.out.println("------------------Use of PriorityQueue Built in class--------");

        UseOfPriorityQueueClass pqExample = new UseOfPriorityQueueClass(new PriorityQueue<>(Comparator.comparingInt(s -> s.age)));
        pqExample.Add(new Student("Charlie", 25));
        pqExample.Add(new Student("David", 19));
        System.out.println(pqExample);

        System.out.println("------------------Use of DeQue Built in class----------------");

        UseOfDequeClass dqExample = new UseOfDequeClass(new ArrayDeque<>());
        //UseOfDequeClass dqExample = new UseOfDequeClass(new LinkedList<>());
        dqExample.AddFirst(new Student("Eve", 21));
        dqExample.AddLast(new Student("Frank", 23));
        System.out.println(dqExample);

        System.out.println("------------------END OF THE CLASS FILE----------------------");
    }
}
