package com.sda.zdjavapol68.example.zad30;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Path resourceDir = Paths.get("src", "main", "resources");
        Path inputFile = resourceDir.resolve("sometextfile.txt");

        //List<String> original = readLinesOldWay(inputFile);
        List<String> original = readLinesWithNio(inputFile);
        System.out.println(original);

        List<String> reversed = original.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversed);

        //writeOldWay(resourceDir.resolve("test.txt"), reversed);
        writeWithNio(resourceDir.resolve("test.txt"), reversed);
    }

    private static void writeWithNio(Path outputFile, List<String> reversed) throws IOException {
        Files.write(outputFile,
                reversed,
                StandardOpenOption.CREATE);
    }

    private static List<String> readLinesWithNio(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }

    private static void writeOldWay(Path outputFile, List<String> reversed) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile.toFile()))) {
            out.write(reversed.stream().collect(Collectors.joining(System.lineSeparator())));
        }
    }

    private static List<String> readLinesOldWay(Path inputFile) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(inputFile.toFile()))) {
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
    }
}
