package com.sda.zdjavapol68.example.zad33;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ImageSearcher imageSearcher = new MaciekImageSearcher();

        Path path = Paths.get("src", "main", "resources", "zad33");
        List<File> images = imageSearcher.getImages(path);

        System.out.println(images);
    }
}
