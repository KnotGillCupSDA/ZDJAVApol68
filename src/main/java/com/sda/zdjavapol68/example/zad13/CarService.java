package com.sda.zdjavapol68.example.zad13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getSorted(SortOrder sortOrder) {

        return cars.stream()
                .sorted(getCarComparator(sortOrder))
                .collect(Collectors.toList());

       /* return cars.stream()
                .sorted((o1, o2) -> {
                    if(sortOrder == SortOrder.ASC) {
                        return o1.getName().compareToIgnoreCase(o2.getName())
                    } else {
                        return -o1.getName().compareToIgnoreCase(o2.getName())
                    }
                })
                .collect(Collectors.toList());*/
    }

    private Comparator<Car> getCarComparator(SortOrder sortOrder) {
        Comparator<Car> comparing = Comparator.comparing(Car::getName);
        if (sortOrder == SortOrder.DESC) {
            comparing = comparing.reversed();
        }
        return comparing;
    }
}
