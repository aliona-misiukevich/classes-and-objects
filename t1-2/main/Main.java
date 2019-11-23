package com.company.task5.main;

import com.company.t2.main.Test2;

public class Main {

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.setFirst(5);
        test1.setSecond(10);

        test1.print();

        Test2 test2 = new Test2("qqq", 4);
        test2.setB(Integer.MAX_VALUE);
        int b = test2.getB();

    }
}
