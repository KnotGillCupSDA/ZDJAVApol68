package com.sda.zdjavapol68.example.zad12;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1912, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1930, "Germany");

        Car car1 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, Collections.singletonList(audi), EngineType.S4);
        Car car2 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, List.of(audi, bmw), EngineType.S4);

        System.out.println(Set.of(car1, car2));



    }
}
