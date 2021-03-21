package com.sda.zdjavapol68.example.zad28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SkipArrayListTest {

    @Test
    void thatWeCanGetEveryNthElement() {
        SkipArrayList<String> strings = new SkipArrayList<>();
        strings.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));

        List<String> everyNthElement = strings.getEveryNthElement(2, 3);

        Assertions.assertTrue(everyNthElement.containsAll(List.of("c", "g")));
    }
}