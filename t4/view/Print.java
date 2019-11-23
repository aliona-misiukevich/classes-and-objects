package com.company.t4.view;

import com.company.t4.main.Depo;
import com.company.t4.main.Train;

public class Print {
    public static void printTrainInfo(Depo depo, int number) {
        Train train = depo.getTrain(number);
        if (train == null) {
            System.out.println("there is no such train");
        } else {
            System.out.println(train.toString());
        }
    }
}
