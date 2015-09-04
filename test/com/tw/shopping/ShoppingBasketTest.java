package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void shouldBeEmptyInitially() {
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(basket.getBasket().size(), 0);
    }
}