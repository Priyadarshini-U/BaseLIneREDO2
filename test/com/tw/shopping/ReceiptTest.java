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

}