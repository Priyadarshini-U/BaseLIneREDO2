package com.tw.shopping;

import java.util.HashMap;

public class ShoppingBasket {
    private HashMap<Good, Integer> list;

    public ShoppingBasket() {
        list = new HashMap<Good, Integer>();
    }

    public HashMap<Good, Integer> getBasket() {
        return list;
    }
}
