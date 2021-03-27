package com.sda.zdjavapol68.example.zad32;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {

    private static final long serialVersionUID = 922820277968106382L;

    private final String name;
    private final String model;
    private final double price;
    private final List<Manufacturer> manufacturers;

    public Car(String name, String model, double price, List<Manufacturer> manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.manufacturers = manufacturers;
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

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
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
                ", manufacturers=" + manufacturers +
                '}';
    }
}
