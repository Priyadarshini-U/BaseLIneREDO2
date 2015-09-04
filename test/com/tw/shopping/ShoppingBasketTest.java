package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingBasketTest {

    @Test
    public void shouldBeEmptyInitially() {
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(basket.getBasket().size(), 0);
    }

    @Test
    public void shouldContainAddedGood() {
        ShoppingBasket basket = new ShoppingBasket();
        Good good = new Good("rice", 34.90, new Type("food"));

        basket.addToIt(good, 1);

        assertTrue(basket.getBasket().containsKey(good));
    }

    @Test
    public void shouldNotContainGoodNotAdded() {
        ShoppingBasket basket = new ShoppingBasket();
        Good good1 = new Good("rice", 34.90, new Type("food"));
        Good good2 = new Good("wheat", 34.90, new Type("food"));

        basket.addToIt(good1, 1);
        basket.addToIt(good2, 1);

        assertEquals(basket.getBasket().size(), 2);
    }
}