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
    }

}