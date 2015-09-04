package com.tw.shopping;

public class Good {
    private String name;
    private double price;
    private Type type;

    public Good(String name, double price, Type type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public double salesTax() {
        if (type.salesTaxExempted())
            return 0.0;
        return price / 10;
    }

    public double importTax() {
        if (name.contains("imported"))
            return price / 20.0;
        return 0.0;
    }
}
