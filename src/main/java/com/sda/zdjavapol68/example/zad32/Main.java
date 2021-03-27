package com.sda.zdjavapol68.example.zad32;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Manufacturer bmw = new Manufacturer("BMW", 1912, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1930, "Germany");
        Manufacturer subaru = new Manufacturer("Subaru", 1930, "Japan");
        
        Car car1 = new Car("Moj pierwszy samochod", "A2", 10.0);

        Car car2 = new Car("Moj drugi samochod", "A2", 10.0);
        Car car3 = new Car("Sub", "Outback", 16.0);
        List<Car> cars = List.of(car1, car2, car3);

        //CarStorage carStorage = new SerializableCarStorage(Paths.get("src", "main", "resources", "cars.db"));
        CarStorage carStorage = new JsonCarStorage(Paths.get("src", "main", "resources", "cars.json"));

        carStorage.save(cars);

        List<Car> loadedCars = carStorage.load();
        System.out.println(loadedCars);

    }
}
