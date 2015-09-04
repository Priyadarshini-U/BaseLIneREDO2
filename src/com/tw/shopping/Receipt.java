package com.tw.shopping;

import java.util.HashMap;

public class Receipt {
    private final HashMap<Good, Integer> items;

    public Receipt(ShoppingBasket basket) {
        this.items =basket.getBasket();
    }
}
