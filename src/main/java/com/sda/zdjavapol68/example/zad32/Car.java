package com.sda.zdjavapol68.example.zad32;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 922820277968106382L;

    private final String name;
    private final String model;
    private final double price;

    @JsonCreator
    public Car(@JsonProperty("name") String name,
               @JsonProperty("model") String model,
               @JsonProperty("price") double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    /* private void writeObject(ObjectOutputStream oos) {
        System.out.println("write");
    }

    private void readObject(ObjectInputStream ois) {
        System.out.println("read");
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
