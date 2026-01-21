package org.example.CollectionFramework.List.ArrayList;

import java.util.LinkedList;

public class ArrayList {
    void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        java.util.ArrayList<Integer> vector1 = new java.util.ArrayList<>(linkedList);
        System.out.println(vector1);
        for(int i = 0; i < vector1.size(); i++){
            System.out.println(vector1.get(i));
        }
        vector1.clear();
        System.out.println(vector1);


        java.util.ArrayList<Integer> list1 = new java.util.ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list1.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list1.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list1.size()); // Output: 2000


    }
}
