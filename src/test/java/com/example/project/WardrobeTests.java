package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WardrobeTests {
    @Test
    void testSize50() {
        Wardrobe w = new Wardrobe();
        w.setSize(50);
        int size = w.getSize();
        assertEquals(50, size);
    }

    @Test
    void testSize75() {
        Wardrobe w = new Wardrobe();
        w.setSize(75);
        int size = w.getSize();
        assertEquals(75, size);
    }
}
