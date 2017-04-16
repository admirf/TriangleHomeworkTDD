package com.admirf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by admir on 16.04.2017..
 */
class TriangleTest {

    @Test
    void testIsTriangle() {
        assertEquals(true, Triangle.isTriangle(3, 4, 5));
        assertEquals(false, Triangle.isTriangle(3, 5, 9));
        assertEquals(false, Triangle.isTriangle(3, 9, 5));
        assertEquals(true, Triangle.isTriangle(0.3, 0.4, 0.5));
    }

    @Test
    void testGetAngleType() {
        assertEquals(Triangle.TriangleType.Right, Triangle.getAngleType(3, 4, 5));
    }

}