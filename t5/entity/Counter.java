package com.company.t4.entity;
//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.Счетчик имеет методы увеличения и уменьшения
// состояния,
// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

import java.util.Random;

public class Counter {
    private int number;
    private int min;
    private int max;

    public Counter(int number, int min, int max) {
        this(min, max);
        this.number = number;
    }

    public Counter(int min, int max) {
        Random random = new Random();
        this.number = random.nextInt(max - min + 1);
        this.min = min;
        this.max = max;
    }

    public int getNumber() {
        return number;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
