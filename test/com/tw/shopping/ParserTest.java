package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnQuantityOfGood() {
        Parser parser = new Parser("1 book at 12.49");
        assertEquals(parser.getQuantity(), 1);
    }

}