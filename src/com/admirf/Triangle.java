package com.admirf;

/**
 * Created by admir on 16.04.2017..
 */
public class Triangle {

    /**
     * Checks if whether three sides can form a triangle
     * @param a Side A of triangle
     * @param b Side B of triangle
     * @param c Side C of triangle
     * @return true if given sides can form a triangle, false otherwise
     */
    public static boolean isTriangle(double a, double b, double c) {
        if(a + b > c) return true;
        else return false;
    }

}
