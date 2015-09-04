//An Item has a cost and determines whether importTax,salesTax is levied on it or not
package com.pathashala.baseline;

public class Item {

    private String input;
    private double cost;

    public Item(String input) {

        this.input = input;
        retriveCost(input);
    }

    private void retriveCost(String input) {
        String[] tempInput = input.split(" ");
        int length = tempInput.length;
        cost = Double.parseDouble(tempInput[length - 1]);
    }

    public boolean isImported() {
        return input.contains("imported");
    }

    public boolean OmitTax() {
        if (input.contains("chocolate") || input.contains("pills") || input.contains("book"))
            return true;
        else
            return false;
    }
}
