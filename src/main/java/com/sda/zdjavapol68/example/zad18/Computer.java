package com.sda.zdjavapol68.example.zad18;

import java.util.Objects;

public class Computer {

    private final String cpu;
    private final int ram;
    private final String name;
    private final String model;

    public Computer(String cpu, int ram, String name, String model) {
        this.cpu = cpu;
        this.ram = ram;
        this.name = name;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(cpu, computer.cpu) && Objects.equals(name, computer.name) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, name, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
