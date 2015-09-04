package com.pathashala.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestItem {

    @Test
    public void ShouldReturnFalseWhenItemIsNotImported() {
        Item item = new Item("1 book at 12.49");

        assertEquals(item.isImported(), false);
    }

}
