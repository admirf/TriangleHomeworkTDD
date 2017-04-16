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
        try {
            assertEquals(Triangle.TriangleType.Right, Triangle.getAngleType(3, 4, 5));
            assertEquals(Triangle.TriangleType.Right, Triangle.getAngleType(0.3, 0.4, 0.5));
            assertEquals(Triangle.TriangleType.Obtuse, Triangle.getAngleType(10, 14, 5));
            assertEquals(Triangle.TriangleType.Obtuse, Triangle.getAngleType(0.10, 0.14, 0.05));
            assertEquals(Triangle.TriangleType.Acute, Triangle.getAngleType(7, 6, 5));
            assertEquals(Triangle.TriangleType.Acute, Triangle.getAngleType(0.7, 0.6, 0.5));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void testGetSideType() {
        try {
            assertEquals(Triangle.TriangleType.Equilateral, Triangle.getSideType(3, 3, 3));
            assertEquals(Triangle.TriangleType.Isosceles, Triangle.getSideType(3, 4, 4));
            assertEquals(Triangle.TriangleType.None, Triangle.getSideType(3, 4, 5));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}