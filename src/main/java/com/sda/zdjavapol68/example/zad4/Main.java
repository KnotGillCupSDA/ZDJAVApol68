package com.sda.zdjavapol68.example.zad4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("klucz1", "wartosc1");
        storage.addToStorage("klucz1", "wartosc2");

        storage.printValues("klucz1");
        storage.printValues("klucz2");

        storage.findValues("wartosc1");

    }
}
