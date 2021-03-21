package com.sda.zdjavapol68.example.zad14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final int BOUND = 250_000;

    public static void main(String[] args) {
        int[] array = new int[100_000];

        fill(array);
        //System.out.println(Arrays.toString(array));

        System.out.println("==================");
        List<Integer> distinct = getDistinct(array);
        System.out.println(distinct.size());

        System.out.println("==================");
        List<Integer> duplicates = getDuplicated(array);
        System.out.println(duplicates);

        System.out.println("==================");
        List<Integer> top = getTop(array);
        System.out.println(top);

        fixDuplicates(array);
        System.out.println("duplicates after fix: " + getDuplicated(array).size());

    }

    private static void fill(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(BOUND);
        }
    }

    private static List<Integer> getDistinct(int[] array) {

        //using an explicit helper data structure that holds distinct values
        /*Set<Integer> helperSet = new HashSet<>();
        for (int i : array) {
            helperSet.add(i);
        }
        return new ArrayList<>(helperSet);*/

        return Arrays.stream(array).distinct().boxed().collect(Collectors.toList());
    }

    private static List<Integer> getDuplicated(int[] array) {

        Set<Integer> helperSet = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int i : array) {
            if (!helperSet.add(i)) {
                duplicates.add(i);
            }
        }
        return duplicates;

       /* return Arrays.stream(array)
                .filter(i -> !helperSet.add(i))
                .boxed()
                .collect(Collectors.toList());*/
    }

    private static List<Integer> getTop(int[] array) {

        Map<Integer, Integer> counters = new HashMap<>();

        for (int i : array) {
            // count occurrences

            //if not exists then put with value 1
            //else increment the value

            if (counters.containsKey(i)) {
                int incrementedValue = counters.get(i) + 1;
                counters.put(i, incrementedValue);
            } else {
                counters.put(i, 1);
            }

            /*counters.compute(i, (k, v) -> {
                if (v == null) {
                    return 1;
                } else {
                    return v + 1;
                }
            });*/
        }
        System.out.println(counters);

        return counters.entrySet().stream()
                .sorted((o1, o2) -> -o1.getValue().compareTo(o2.getValue()))
                .map(Map.Entry::getKey)
                .limit(25)
                .collect(Collectors.toList());
    }

    private static void fixDuplicates(int[] array) {
        Random random = new Random();
        Set<Integer> helperSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!helperSet.add(array[i])) {

                int candidate = random.nextInt(BOUND);
                while(!helperSet.add(candidate)) {
                    candidate = random.nextInt(BOUND);
                }

                array[i] = candidate;
            }
        }

    }
}
