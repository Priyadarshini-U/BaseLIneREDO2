package com.tw.shopping;

import java.util.HashMap;

public class Receipt {
    private final HashMap<Good, Integer> items;

    public Receipt(ShoppingBasket basket) {
        this.items =basket.getBasket();
    }

    public double sumOfItemPrices() {
        double sumOfItemPrices = 0.0;
        if(items.size() == 0)
            return 0.0;
        for(Good good: items.keySet()) {
            sumOfItemPrices += good.price() *items.get(good);
        }
        return sumOfItemPrices;
    }

    public double totalTax() {
        return 0;
    }
}
