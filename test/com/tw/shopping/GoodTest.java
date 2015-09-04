package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldHaveSalesTaxForGood() {
        assertEquals(new Good("cds", 34.90, new Type("accessories")).salesTax(), 3.49, 0.1);
    }

    @Test
    public void shouldHaveZeroSalesTaxForGoodOfTypeFood() {
        assertEquals(new Good("rice", 34.90, new Type("food")).salesTax(), 0.0, 0.1);
    }

    @Test
    public void shouldHaveZeroSalesTaxForGoodOfTypeMedicine() {
        assertEquals(new Good("paracetomol", 34.90, new Type("medicine")).salesTax(), 0.0, 0.1);
    }

    @Test
    public void shouldHaveZeroSalesTaxForGoodOfTypeBook() {
        assertEquals(new Good("paracetomol", 34.90, new Type("book")).salesTax(), 0.0, 0.1);
    }

    @Test
    public void shouldHaveZeroImportTaxForGoodThatIsNotImported() {
        assertEquals(new Good("paracetomol", 34.90, new Type("book")).importTax(), 0.0, 0.1);
    }

    @Test
    public void shouldHaveImportTaxForGoodThatIsImported() {
        assertEquals(new Good("imported paracetomol", 34.90, new Type("book")).importTax(), 34.90 / 20, 0.1);
    }

    @Test
    public void shouldBeEqualToItself() {
        Good good = new Good("imported paracetomol", 34.90, new Type("book"));
        assertEquals(good, good);
    }
}