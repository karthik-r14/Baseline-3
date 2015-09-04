//An Item has cost,RateOfInterest and determines whether importTax,salesTax is levied on it or not and also computes tax
package com.pathashala.baseline;

public class Item {

    private String input;
    private double cost;
    private double rateOfInterest;
    private double salesTax;

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

    public double computeTax() {

        if (!OmitTax()) {
            rateOfInterest = 10;
            salesTax = (rateOfInterest * cost) / 100;

        }
        if (isImported()) {
            rateOfInterest = 5;
            salesTax += (rateOfInterest * cost ) / 100;
        }

        return salesTax;
    }
}
