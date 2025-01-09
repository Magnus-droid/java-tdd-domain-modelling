package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void itemIsNotAlreadyInBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("TestItem1", 1));
    }

    @Test
    public void itemIsAlreadyInBasket() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add("TestItem2", 1));
    }
}
