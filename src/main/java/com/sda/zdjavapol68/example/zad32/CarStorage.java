package com.sda.zdjavapol68.example.zad32;

import java.io.IOException;
import java.util.List;

public interface CarStorage {

    void save(List<Car> cars) throws IOException;

    List<Car> load() throws IOException, ClassNotFoundException;
}
