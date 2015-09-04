package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TypeTest {

    @Test
    public void shouldReturnFoodBookAndMedicineAsNonTaxable() {
        assertTrue(new Type("food").salesTaxExempted());
    }
}