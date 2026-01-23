package org.example.CollectionFramework.Set.Basics;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class BasicExample {
    static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        set.clear();
        System.out.println(set.isEmpty());
        for(int i: set){
            System.out.println(i);
        }
        Set<Integer> set1 =  new ConcurrentSkipListSet<>();
        Set<Integer> integers = Set.of(1, 2, 3,4,5,6,7,8,9,54,4323,545,4545);
    }
}
