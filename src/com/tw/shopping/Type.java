package com.tw.shopping;

public class Type {
    private String name;

    public Type(String name){
        this.name = name;
    }

    public boolean salesTaxExempted() {
        if (name.equals("food") || name.equals("medicine") || name.equals("book"))
            return true;
        return false;
    }
}
