package com.sda.zdjavapol68.example.zad33;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class ImageSearcherWalkTree implements ImageSearcher {
    @Override
    public List<File> getImages(Path path) {
        List<File> files = new ArrayList<>();
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    File f = file.toFile();
                    if (f.getName().endsWith(".png") || f.getName().endsWith(".jpg")) {
                        files.add(f);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return files;
    }
}
