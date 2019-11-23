package com.company.t4.logic;
//7. Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

import com.company.t4.entity.Triangle;

public class TriangleLogic {

    private static double calculateSide(int x1, int x2, int y1, int y2) {
        double s = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return s;
    }

    public static double calculateSquare(Triangle triangle){
        double s = 0.5 * (((triangle.getX1() - triangle.getX3()) * (triangle.getY1() - triangle.getY3())) - ((triangle.getY3() - triangle.getY1()) * (triangle.getX2() - triangle.getX3())));
        return s;
    }

    public static double calculatePerimeter(Triangle triangle){
        double ab = calculateSide( triangle.getX1(), triangle.getX2(), triangle.getY1(), triangle.getY2());
        double bc = calculateSide(triangle.getX2(), triangle.getX3(), triangle.getY2(), triangle.getY3());
        double ac = calculateSide(triangle.getX1(), triangle.getX3(), triangle.getY1(), triangle.getY3());
        double p = ab + bc + ac;
        return p;
    }

    public static double calculateMedianX(Triangle triangle) {
        double x = (triangle.getX1() + triangle.getX2() + triangle.getX3())/3;
        return x;
    }

    public static double calculateMedianY(Triangle triangle){
        double y = (triangle.getY1() + triangle.getY2() + triangle.getY3())/3;
        return y;
    }

}
