package com.sda.zdjavapol68.example.zad4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private final Map<String, List<String>> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value){
        //storage.put(key, value);

        // check if there is already that key in the stotage
        // if so, add value to the existing list
        // if not add new list with 1 element
    }

    public void printValues(String key) {
    }

    public void findValues(String value) {

    }
}
