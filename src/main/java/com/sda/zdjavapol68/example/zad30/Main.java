package com.sda.zdjavapol68.example.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) throws IOException {
        Path resourceDir = Paths.get("src", "main", "resources");
        Path inputFile = resourceDir.resolve("sometextfile.txt");

        String originalText = Files.readString(inputFile);
        System.out.println(originalText);

        Files.writeString(resourceDir.resolve("test.txt"),
                originalText,
                StandardOpenOption.CREATE);

    }
}
