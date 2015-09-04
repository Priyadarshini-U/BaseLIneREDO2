package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldHaveSalesTaxForGood() {
        assertEquals(new Good("cds", 34.90).salesTax(), 3.49, 0.1);
    }

}