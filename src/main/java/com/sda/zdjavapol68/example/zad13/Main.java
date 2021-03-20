package com.sda.zdjavapol68.example.zad13;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1912, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1930, "Germany");
        Manufacturer subaru = new Manufacturer("Subaru", 1930, "Japan");

        Car car1 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, Collections.singletonList(audi), EngineType.V12);
        Car car2 = new Car("Moj drugi samochod", "A2", 10.0, 1999, List.of(audi, bmw), EngineType.V12);
        Car car3 = new Car("Sub", "Outback", 16.0, 2011, List.of(subaru), EngineType.V8);

        CarService carService = new CarService();
        carService.add(car1);
        carService.add(car2);
        carService.add(car3);

        System.out.println(carService.getCars());
        System.out.println("============");

        carService.remove(car2);
        System.out.println(carService.getCars());
        System.out.println("============");

        carService.add(car2);
        System.out.println(carService.getSorted(SortOrder.ASC));
        System.out.println("============");
        System.out.println(carService.getSorted(SortOrder.DESC));

    }
}
