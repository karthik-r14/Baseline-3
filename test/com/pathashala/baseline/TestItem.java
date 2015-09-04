package com.pathashala.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestItem {

    @Test
    public void ShouldReturnFalseWhenItemIsNotImported() {
        Item item = new Item("1 book at 12.49");

        assertEquals(item.isImported(), false);
    }

    @Test
    public void shouldReturnTrueWhenItemIsImported() {
        Item item = new Item("1 imported bottle of perfume at 27.99");

        assertEquals(item.isImported(), true);
    }

    @Test
    public void shouldOmitTaxWhenItemIsFood() {
        Item item = new Item("1 chocolate bar at 0.85");

        assertEquals(item.OmitTax(), true);
    }

    @Test
    public void shouldOmitTaxWhenItemIsMedicalProduct() {
        Item item = new Item("1 packet of headache pills at 9.75");

        assertEquals(item.OmitTax(), true);
    }
}
