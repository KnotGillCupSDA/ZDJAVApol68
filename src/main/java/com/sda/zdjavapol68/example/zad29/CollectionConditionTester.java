package com.sda.zdjavapol68.example.zad29;

import java.util.Collection;
import java.util.function.Predicate;

public class CollectionConditionTester {

    private CollectionConditionTester() {
    }

    public static <T> double partOf(Collection<T> collection, Predicate<T> predicate) {
        return (100.0 * collection.stream().filter(predicate).count()) / collection.size();
    }
}
