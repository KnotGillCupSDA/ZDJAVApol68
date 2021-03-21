package com.sda.zdjavapol68.example.zad24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {

    private Basket basket;

    @BeforeEach
    void setUp() {
        basket = new Basket();
    }

    @Test
    void thatWeCantRemoveFromEmptyBasket() {
        Assertions.assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket());
    }

    @Test
    void thatWeCantAddMoreThanTenElements() {
        for (int i = 0; i < 10; i++) {
            basket.addToBasket();
        }

        Assertions.assertThrows(BasketFullException.class, () -> basket.addToBasket());
    }

}