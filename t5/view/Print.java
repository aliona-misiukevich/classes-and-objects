package com.company.t4.view;

import com.company.t4.entity.Counter;
import com.company.t4.logic.Logic;

public class Print {

    public static void printCurrent(Counter x){
        System.out.println(Logic.getCurrent(x));
    }
}
