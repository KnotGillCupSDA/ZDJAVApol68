package com.sda.zdjavapol68.example.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> unsorted = List.of("A", "B", "b", "Z", "a", "c");

        List<String> sorted = sort(unsorted);

        System.out.println(sorted);
    }

    private static List<String> sort(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);

        //with concrete class
        //Collections.sort(sorted, new MyComparator());

        //with anonymous class
        /*Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });*/

        //with lambda - since java 8
        //Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));

        //method on list - since java 11
        //sorted.sort((o1, o2) -> -o1.compareTo(o2));

        //with stream
        //sorted = unsorted.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());

        //with reverse order
        sorted = unsorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return sorted;
    }
}
