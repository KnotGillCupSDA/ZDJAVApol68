package com.sda.zdjavapol68.example.zad33;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SewerynImageSearcher implements ImageSearcher {
    @Override
    public List<File> getImages(Path path) {
        try (Stream<Path> walk = Files.walk(path)) {
            return walk.map(Path::toFile)
                    .filter(image -> image.getName().endsWith(".png") || image.getName().endsWith(".jpg"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
            //return Collections.emptyList();
        }
    }
}
