package com.company.t4.view;

import com.company.t4.entity.Airline;

import java.util.List;

public class Print {
    public static void printList(List<Airline> airlines){
        for (Airline airline:
             airlines) {
            System.out.println(airline.toString());
        }
    }
}
