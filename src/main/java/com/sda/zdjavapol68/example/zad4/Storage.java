package com.sda.zdjavapol68.example.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private final Map<String, List<String>> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        //storage.put(key, value);

        // check if there is already that key in the storage
        // if so, add value to the existing list
        // if not add new list with 1 element

        if (storage.containsKey(key)) {
            storage.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            storage.put(key, list);
            list.add(value);
        }


        // it's good to know that there are more advanced methods that provide the functionality
        // and in some implementations they provide atomicity
        /*List<String> strings = storage.computeIfAbsent(key, s -> new ArrayList<>());
        strings.add(value);*/
    }

    public void printValues(String key) {
        List<String> values = storage.get(key);
        if (values != null) {
            System.out.println(values);
        }
    }

    public void findValues(String value) {

    }
}
