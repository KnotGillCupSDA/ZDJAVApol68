package com.sda.zdjavapol68.example.zad25;

public class Basket {

    private int items;

    public void addToBasket() throws BasketFullException {
        if (items >= 10) {
            throw new BasketFullException();
        }
        items++;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (items <= 0) {
            throw new BasketEmptyException();
        }
        items--;
    }
}
