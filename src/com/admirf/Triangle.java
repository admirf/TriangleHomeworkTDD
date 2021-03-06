package com.admirf;

import static com.admirf.Triangle.TriangleType.Acute;

/**
 * Created by admir on 16.04.2017..
 */
public class Triangle {

    public enum TriangleType {
        Acute,
        Obtuse,
        Right,
        Equilateral,
        Isosceles,
        None
    }

    /**
     * Checks if whether three sides can form a triangle
     * @param a Side A of triangle
     * @param b Side B of triangle
     * @param c Side C of triangle
     * @return true if given sides can form a triangle, false otherwise
     */
    public static boolean isTriangle(double a, double b, double c) {
        if(a + b > c && a + c > b && b + c > a) return true;
        else return false;
    }

    /**

     */
    public static TriangleType getAngleType(double a, double b, double c) throws Exception {
        if(!isTriangle(a, b, c)) throw new Exception("It is not a valid triangle");
        if(a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) return TriangleType.Right;
        if(a * a + b * b < c * c || a * a + c * c < b * b || c * c + b * b < a * a) return TriangleType.Obtuse;
        return TriangleType.Acute;
    }

    /**
     * Checks whether the triangle is equilateral, isosceles or none of the above
     * @param a Side A of triangle
     * @param b Side B of triangle
     * @param c Side C of triangle
     * @return returns Equilateral, Isosceles or None if no sides are equal
     * @throws Exception
     */
    public static TriangleType getSideType(double a, double b, double c) throws  Exception {
        if(!isTriangle(a, b, c)) throw new Exception("It is not a valid triangle");
        if(a == b && b == c) return TriangleType.Equilateral;
        if(a == b || b == c || c == a) return TriangleType.Isosceles;
        return TriangleType.None;
    }
}
