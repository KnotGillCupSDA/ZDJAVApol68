package com.sda.zdjavapol68.example.zad2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> unsorted = List.of("A", "B", "b", "Z", "a", "c");
        List<String> sorted = sort(unsorted);

        System.out.println(sorted);
    }

    private static List<String> sort(List<String> unsorted) {

        //with toLowerCase - mind that we have to allocate memory for the new string on each call
        /*return unsorted.stream()
                .sorted((o1, o2) -> -o1.toLowerCase().compareTo(o2.toLowerCase()))
                .collect(Collectors.toList());*/

        return unsorted.stream()
                .sorted((o1, o2) -> -o1.compareToIgnoreCase(o2))
                .collect(Collectors.toList());

        //high level
        //unsorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());
    }
}
