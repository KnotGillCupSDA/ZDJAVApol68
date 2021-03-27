package com.sda.zdjavapol68.example.zad33;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ImageSearcher imageSearcher = null;

        Path path = Paths.get("src", "main", "resources", "zad33");

        //path.toFile().isDirectory()

/*        path.toFile().listFiles();

        path.toFile().listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });

        Stream<Path> walk = Files.walk();

        Files.walkFileTree(path, new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return null;
            }
        })*/

        List<File> images = imageSearcher.getImages(path);

        System.out.println(images);
    }
}
