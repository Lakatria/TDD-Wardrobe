package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class WardrobeTests {
    private Wardrobe w;

    @BeforeEach
    void setUp(){
        w = new Wardrobe();
    }

    @Test
    void testSize50() {
        w.setSize(50);
        int size = w.getSize();
        assertEquals(50, size);
    }

    @Test
    void testSize75() {
        w.setSize(75);
        int size = w.getSize();
        assertEquals(75, size);
    }

    @Test
    void testPriceOf50cmElement(){
        int price = w.getPrice(50);
        assertEquals(59, price);
    }

    @Test
    void testPriceOf75cmElement() {
        int price = w.getPrice(75);
        assertEquals(62, price);
    }

    @Test
    void testFillWallWithAll50s() {
        w.add(50);
        w.add(50);
        w.add(50);
        w.add(50);
        w.add(50);
        int wall = w.checkWall();
        assertEquals(250, wall);
    }
}
