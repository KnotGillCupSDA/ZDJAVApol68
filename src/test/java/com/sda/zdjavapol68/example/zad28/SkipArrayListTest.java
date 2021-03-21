package com.sda.zdjavapol68.example.zad28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SkipArrayListTest {

    private SkipArrayList<String> skipArrayList;

    @BeforeEach
    void setUp() {
        skipArrayList = new SkipArrayList<>();
    }

    @Test
    void thatWeCanGetEveryNthElement() {
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> everyNthElement = skipArrayList.getEveryNthElement(2, 3);

        Assertions.assertTrue(everyNthElement.containsAll(List.of("c", "g")), "invalid list: " + everyNthElement);
    }

    @Test
    void thatWeCanGetEveryNthIntegerElement() {
        SkipArrayList<Integer> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of(0, 1, 2, 3, 4, 5, 6));
        List<Integer> everyNthElement = skipArrayList.getEveryNthElement(1, 2);

        Assertions.assertTrue(everyNthElement.containsAll(List.of(1, 4)), "invalid list: " + everyNthElement);
    }

    @Test
    void testTooHighStartingIndex() {
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> everyNthElement = skipArrayList.getEveryNthElement(12213, 3);

        Assertions.assertEquals(0, everyNthElement.size());
    }

    @Test
    void testStartingIndexIsBelowZero() {
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> everyNthElement = skipArrayList.getEveryNthElement(-12213, 3);

        Assertions.assertEquals(0, everyNthElement.size());
    }
}