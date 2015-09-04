package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest {

    @Test
    public void shouldNotBeTaxable() {
        assertFalse(new Food("", 2.4, new Type("Food")).taxable());
    }
}