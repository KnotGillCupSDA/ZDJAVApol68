package com.sda.zdjavapol68.example.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path resourceDir = Paths.get("src", "main", "resources");

        Path inputFile = resourceDir.resolve("sometextfile.txt");

        System.out.println(Files.readString(inputFile));

    }
}
