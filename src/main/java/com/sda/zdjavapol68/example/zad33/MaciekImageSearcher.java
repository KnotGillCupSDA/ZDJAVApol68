package com.sda.zdjavapol68.example.zad33;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MaciekImageSearcher implements ImageSearcher {
    @Override
    public List<File> getImages(Path path) {

        List<File> allImages = new ArrayList<>();
        if (path != null) {
            File[] files = path.toFile().listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        allImages.addAll(getImages(file.toPath()));
                    } else {
                        if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg")) {
                            allImages.add(file);
                        }
                    }
                }
            }
        }
        return allImages;
    }


}
