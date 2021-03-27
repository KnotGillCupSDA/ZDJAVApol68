package com.sda.zdjavapol68.example.zad33;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public interface ImageSearcher {
    List<File> getImages(Path path);
}
