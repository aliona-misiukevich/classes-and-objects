package com.company.t2.main;
//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
    private String a;
    private int b;

    public Test2(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this.a = "";
        this.b = 1;
    }

    public String getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(String a){
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

}
