package com.company.task5.main;
// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
// из этих двух переменных.

public class Test1 {
    private int first;
    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void print() {
        System.out.println(first + " " + second);
    }

    public int getSum() {
        return first + second;
    }

    public int getMax() {
        return first > second ? first : second;
    }
}
