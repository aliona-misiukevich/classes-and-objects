package com.company.t4.main;
//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.Счетчик имеет методы увеличения и уменьшения
// состояния,
// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

import com.company.t4.entity.Counter;
import com.company.t4.view.Print;
import com.company.t4.logic.Logic;

public class Main {

    public static void main(String[] args) {
	Counter number1 = new Counter(2, 80);
	Counter number2 = new Counter(5, 0, 9);

	Logic.decrement(number1);
    Logic.increment(number2);

    Print.printCurrent(number2);

    }
}
