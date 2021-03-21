package com.sda.zdjavapol68.example.zad30;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Mateusz {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("src/main/resources/sometextfile.txt");
        List<String> sometextfile = Files.readAllLines(file);
        List<String> reversed = new ArrayList<>();
        System.out.println(sometextfile);
        for (String s : sometextfile) {
            reversed.add(new StringBuilder(s).reverse().toString());
        }
        System.out.println(reversed);
        try (PrintWriter printer = new PrintWriter(new FileWriter("src/main/resources/test.txt"))) {
            for (String s : reversed) {
                printer.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
