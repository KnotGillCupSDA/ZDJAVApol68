package com.sda.zdjavapol68.example.zad32;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class CarStorage {

    private final Path path;

    public CarStorage(Path path) {
        this.path = path;
    }

    public void save(List<Car> cars) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            oos.writeObject(cars);
            //oos.flush();
        }
    }

    public List<Car> load() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object o = ois.readObject();
            return (List<Car>) o;
        }
    }
}
