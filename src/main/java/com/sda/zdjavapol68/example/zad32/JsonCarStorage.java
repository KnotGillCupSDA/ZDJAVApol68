package com.sda.zdjavapol68.example.zad32;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class JsonCarStorage implements CarStorage {

    private final ObjectMapper objectMapper;
    private final Path path;

    public JsonCarStorage(Path path) {
        this.path = path;
        objectMapper = new ObjectMapper();
    }

    @Override
    public void save(List<Car> cars) throws IOException {
        objectMapper.writeValue(path.toFile(), cars);
    }

    @Override
    public List<Car> load() throws IOException {
        return objectMapper.readValue(path.toFile(), new TypeReference<List<Car>>() {});
    }
}
