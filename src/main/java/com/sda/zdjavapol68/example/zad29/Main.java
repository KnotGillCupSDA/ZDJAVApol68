package com.sda.zdjavapol68.example.zad29;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        double v = CollectionConditionTester.partOf(List.of("a", "aa", "ab", "bc"), s -> s.startsWith("a"));
        System.out.println(v);

        double oddNumbersPercentage = CollectionConditionTester.partOf(List.of(1, 2, 3, 4), i -> i % 2 == 0);
        System.out.println(oddNumbersPercentage);
    }
}
