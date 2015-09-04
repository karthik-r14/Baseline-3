package com.pathashala.baseline;

public class Item {

    private String input;
    private double cost;

    public Item(String input) {

        this.input = input;
        retriveCost(input);
    }

    private void retriveCost(String input) {
       String [] tempInput = input.split(" ");
       int length = tempInput.length;
        cost = Double.parseDouble(tempInput[length-1]);
    }

    public boolean isImported() {

        return input.contains("imported");
    }
}
