package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WardrobeTests {
    @Test
    void testSize50() {
        Wardrobe w = new Wardrobe();
        int size = w.getSize();
        assertEquals(50, size);
    }
}
