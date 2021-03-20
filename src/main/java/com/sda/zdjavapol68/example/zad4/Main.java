package com.sda.zdjavapol68.example.zad4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("klucz1", "wartosc1");
        storage.addToStorage("klucz1", "wartosc2");
        storage.addToStorage("klucz2", "wartosc1");
        storage.addToStorage("klucz2", "wartosc3");
        storage.addToStorage("klucz3", "wartosc1");

        System.out.println("printValues");
        storage.printValues("klucz1");
        storage.printValues("klucz2");
        storage.printValues("klucz3");

        System.out.println("findValues");
        storage.findValues("wartosc1");
        //storage.findValues("wartosc2");
        //storage.findValues("wartosc3");

    }
}
