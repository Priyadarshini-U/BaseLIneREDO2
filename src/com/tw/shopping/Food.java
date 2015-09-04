package com.tw.shopping;

public class Food extends Good {

    public Food(String name, double price, Type type) {
        super(name, price, type);
    }

    public boolean taxable() {
        return false;
    }
}
