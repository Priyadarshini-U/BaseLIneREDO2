package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnQuantityOfGood() {
        Parser parser = new Parser("1 book at 12.49");
        assertEquals(parser.getQuantity(), 1);
    }

    @Test
    public void shouldReturnPriceOfGood() {
        Parser parser = new Parser("1 book at 12.49");
        assertEquals(parser.getPrice(), 12.49, 0.0);
    }

    @Test
    public void shouldReturnNameOfGood() {
        Parser parser = new Parser("1 bookat 12.49");
        assertEquals(parser.getGood(), "book");
    }
}