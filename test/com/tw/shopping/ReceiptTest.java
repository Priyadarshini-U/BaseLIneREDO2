package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptTest {

    @Test
    public void shouldReturnZeroAsSumOfGoodsPricesIfNoGoodIsPurchased() {
        ShoppingBasket basket = new ShoppingBasket();

        assertEquals(new Receipt(basket).sumOfItemPrices(), 0.0, 0.01);
    }

    @Test
    public void shouldReturnSumOfGoodsPricesPurchased() {
        ShoppingBasket basket = new ShoppingBasket();

        Good good1 = new Good("rice", 34.90, new Type("food"));
        Good good2 = new Good("wheat", 34.90, new Type("food"));

        basket.addToIt(good1, 1);
        basket.addToIt(good2, 2);

        assertEquals(new Receipt(basket).sumOfItemPrices(), 34.90 * 3, 0.01);
    }

    @Test
    public void shouldReturnZeroAsSumOfTotalTaxOfIfNoGoodPurchased() {
        ShoppingBasket basket = new ShoppingBasket();

        assertEquals(new Receipt(basket).totalTax(), 0.0, 0.01);
    }

    @Test
    public void shouldReturnSumOfTotalTaxForGoodsPurchased() {
        ShoppingBasket basket = new ShoppingBasket();

        Good good1 = new Good("rice", 12.49, new Type("book"));
        Good good2 = new Good("wheat", 14.99, new Type("cd"));
        Good good3 = new Good("choco", 14.99, new Type("food"));

        basket.addToIt(good1, 1);
        basket.addToIt(good2, 1);
        basket.addToIt(good3, 1);
        basket.purchase();

        assertEquals(new Receipt(basket).totalTax(), 1.50, 0.1);
    }

    @Test
    public void shouldReturnTotalSumAsZeroIfNoGoodsPurchased() {
        ShoppingBasket basket = new ShoppingBasket();

        assertEquals(new Receipt(basket).total(), 0.0, 0.1);
    }

    @Test
    public void shouldReturnSumOfTotalTaxAndPriceForGoodsPurchased() {
        ShoppingBasket basket = new ShoppingBasket();

        Good good1 = new Good("rice", 12.49, new Type("book"));
        Good good2 = new Good("wheat", 14.99, new Type("cd"));
        Good good3 = new Good("choco", 0.85, new Type("food"));

        basket.addToIt(good1, 1);
        basket.addToIt(good2, 1);
        basket.addToIt(good3, 1);
        basket.purchase();

        assertEquals(new Receipt(basket).total(), 29.83, 0.1);
    }
}