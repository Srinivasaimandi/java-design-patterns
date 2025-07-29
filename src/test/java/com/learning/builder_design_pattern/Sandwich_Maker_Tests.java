package com.learning.builder_design_pattern;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Sandwich_Maker_Tests {

    @Test
    public void testBasicSandwich() {
        Sandwich sandwich = new Sandwich.Builder("Wheat").build();
        assertEquals(sandwich.getBread(), "Wheat");
        assertNull(sandwich.getMeat());
        assertFalse(sandwich.isToasted());
    }

    @Test
    public void testFullSandwich() {
        Sandwich sandwich = new Sandwich.Builder("White")
                .meat("Turkey")
                .cheese("Swiss")
                .vegetables("Lettuce, Tomato")
                .condiments("Mayo")
                .toasted(true)
                .cutInHalf(true)
                .wrapped(true)
                .sauce("Honey Mustard")
                .build();

        System.out.println(sandwich.toString());
        assertEquals(sandwich.getBread(), "White");
        assertEquals(sandwich.getMeat(), "Turkey");
        assertEquals(sandwich.getCheese(), "Swiss");
        assertEquals(sandwich.getVegetables(), "Lettuce, Tomato");
        assertEquals(sandwich.getCondiments(), "Mayo");
        assertTrue(sandwich.isToasted());
        assertTrue(sandwich.isCutInHalf());
        assertTrue(sandwich.isWrapped());
        assertEquals(sandwich.getSauce(), "Honey Mustard");
    }

    @Test
    public void testToString() {
        Sandwich sandwich = new Sandwich.Builder("Rye")
                .meat("Ham")
                .cheese("Cheddar")
                .build();
        String str = sandwich.toString();
        assertTrue(str.contains("bread='Rye'"));
        assertTrue(str.contains("meat='Ham'"));
        assertTrue(str.contains("cheese='Cheddar'"));
    }
}
