package com.tw.shopping;

public class Parser {
    private String inputLine;

    public Parser(String line) {
        this.inputLine = line;
    }

    public int getQuantity() {
        String quantity = inputLine.split("\\ ")[0];
        return Integer.parseInt(quantity);
    }
}
