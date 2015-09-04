package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldHaveSalesTaxForGood() {
        assertEquals(new Good("cds", 34.90, "accessories").salesTax(), 3.49, 0.1);
    }

    @Test
    public void shouldHaveZeroSalesTaxForGoodOfTypeFood() {
        assertEquals(new Good("rice", 34.90, "food").salesTax(), 0.0, 0.1);
    }

    @Test
    public void shouldHaveZeroSalesTaxForGoodOfTypeMedicine() {
        assertEquals(new Good("paracetomol", 34.90, "medicine").salesTax(), 0.0, 0.1);
    }

    @Test
    public void shouldHaveZeroSalesTaxForGoodOfTypeBook() {
        assertEquals(new Good("paracetomol", 34.90, "book").salesTax(), 0.0, 0.1);
    }
}