package com.sda.zdjavapol68.example.zad31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Path zad31Dir = Paths.get("src", "main", "resources", "zad31");
        Path inputFile = zad31Dir.resolve("veryLongFile.txt");

        //read file
        List<String> lines = Files.readAllLines(inputFile);

        //count occurrences
        Map<String, Integer> counters = countWords(lines);

        //write occurrences to file
        Files.writeString(zad31Dir.resolve("counters.txt"), format(counters), StandardOpenOption.CREATE);
    }

    private static String format(Map<String, Integer> counters) {
        return counters.entrySet().stream()
                .map(e -> e.getKey() + " => " + e.getValue())
                .collect(Collectors.joining(System.lineSeparator()));
    }

    private static Map<String, Integer> countWords(List<String> lines) {
        Map<String, Integer> mapList = new HashMap<>();
        for (String s : lines) {
            String[] l = s.split(" ");
            for (String value : l) {
                if (mapList.containsKey(value)) {
                    mapList.put(value, mapList.get(value) + 1);
                } else {
                    mapList.put(value, 1);
                }
            }
        }
        return mapList;
    }
}
