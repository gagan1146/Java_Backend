package org.example.Java8.Streams.StreamImportance.WithStramUsage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 6, 342, 53, 23, 2, 453, 24, 43, 543, 235, 66};

        int sumi = Arrays.stream(arr).filter(x -> x % 2 == 0).sum();

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        List<Integer> collected = Stream.of(1, 2, 3).toList();

        List<Integer> limit1 = Stream.iterate(0, n -> n + 1).limit(10).toList();

        List<String> limit2 = Stream.generate(() -> "Hi, I am using Supplier Method...")
                .limit(5)
                .toList();
        List<Integer> limit3 = Stream.generate(() -> (int)(Math.random()*100)+1)
                .limit(5)
                .toList().reversed();
        List<Integer> filteredList = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .boxed() // convert IntStream → Stream<Integer>
                .toList();

        List<Integer>list1 = Stream.iterate(0,x->x+1).limit(101).skip(1).peek(x->System.out.print( x +" ")).map(x->x/10).distinct().skip(1).toList();
        System.out.println();
        System.out.println("Sum of even numbers: " + sumi);
        System.out.println("Stream.of elements: " + collected);
        System.out.println("Iterate result: " + limit1);
        System.out.println("Generate result: " + limit2);
        System.out.println("Generate result: " + limit3);
        System.out.println("After filtering elements by even then divide each value by 2 : " + filteredList);
        System.out.println("The List generated is : " + list1);
    }
}