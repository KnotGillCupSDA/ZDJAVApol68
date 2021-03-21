package com.sda.zdjavapol68.example.zad14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100_000];

        fill(array);

        List<Integer> distinct = getDistinct(array);

        List<Integer> duplicates = getDuplicated(array);

        List<Integer> top = getTop(array);
    }

    private static void fill(int[] array) {

    }

    private static List<Integer> getDistinct(int[] array) {
        return null;
    }

    private static List<Integer> getDuplicated(int[] array) {
        return null;
    }

    private static List<Integer> getTop(int[] array) {
        return null;
    }
}
