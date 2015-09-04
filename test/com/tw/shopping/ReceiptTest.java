package com.tw.shopping;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptTest {

    @Test
    public void shouldReturnZeroAsSumOfGoodsPricesIfNoGoodIsPurchased(){
        ShoppingBasket basket = new ShoppingBasket();

        assertEquals(new Receipt(basket).sumOfItemPrices(), 0.0, 0.01);
    }

}