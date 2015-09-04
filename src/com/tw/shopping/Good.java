package com.tw.shopping;

public class Good {
    private String name;
    private double price;
    private String type;

    public Good(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public double salesTax() {
        if (type.equals("food") || type.equals("medicine"))
            return 0.0;
        return price / 10;
    }
}
