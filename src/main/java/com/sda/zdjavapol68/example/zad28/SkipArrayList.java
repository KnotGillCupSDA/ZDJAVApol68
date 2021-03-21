package com.sda.zdjavapol68.example.zad28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {
        if (startIndex < 0 | startIndex >= size()) {
            return Collections.emptyList();
        }
        List<E> skipped = new ArrayList<>();

        /*int currentIndex = startIndex;
        while (currentIndex < size()) {
            skipped.add(get(currentIndex));
            currentIndex += skip + 1;
        }*/

        for (int i = startIndex; i < size(); i += skip + 1) {
            skipped.add(get(i));
        }

        return skipped;
    }

    @Override
    public int size() {
        System.out.println("my size");
        return super.size();
    }
}
