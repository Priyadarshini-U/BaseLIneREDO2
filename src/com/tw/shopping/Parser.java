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

    public double getPrice() {
        int index = inputLine.lastIndexOf("at");
        String[] tokens = {inputLine.substring(0, index + 2), inputLine.substring(index + 2)};
        return Double.parseDouble(tokens[1]);
    }

    public String getGood() {
        int index = inputLine.lastIndexOf("at");
        String[] tokens = {inputLine.substring(2, index), inputLine.substring(index + 2)};
        return tokens[0];
    }


}
