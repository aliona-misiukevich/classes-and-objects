package com.company.t4.main;
//7. Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

import com.company.t4.entity.Triangle;
import com.company.t4.logic.TriangleLogic;
import com.company.t4.view.Print;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle(5, 12, 7, 5,2,0);
	TriangleLogic.calculateSquare(triangle);
	TriangleLogic.calculatePerimeter(triangle);
	double x = TriangleLogic.calculateMedianX(triangle);
	double y = TriangleLogic.calculateMedianY(triangle);

	Print.printMedian(x, y);
    }
}
