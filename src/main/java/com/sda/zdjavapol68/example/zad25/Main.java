package com.sda.zdjavapol68.example.zad25;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        try {
            basket.removeFromBasket();
            System.out.println("removed");
        } catch (BasketEmptyException e) {
            System.out.println("not removed");
            //e.printStackTrace();
        }
    }
}
