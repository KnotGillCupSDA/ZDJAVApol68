package com.sda.zdjavapol68.example.zad32;

import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Moj pierwszy samochod", "A2", 10.0);
        Car car2 = new Car("Moj drugi samochod", "A2", 10.0);
        Car car3 = new Car("Sub", "Outback", 16.0);
        List<Car> cars = List.of(car1, car2, car3);

        CarStorage carStorage = new CarStorage(Paths.get("src", "main", "resources", "cars.db"));

        carStorage.save(cars);

        List<Car> loadedCars = carStorage.load();
        System.out.println(loadedCars);

    }
}
