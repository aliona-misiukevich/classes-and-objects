package com.company.t4.logic;
import com.company.t4.entity.Counter;

public class Logic {
    private static boolean isIncrement(Counter counter) {
        return counter.getNumber() + 1 <= counter.getMax();
    }

    private static boolean isDecrement(Counter counter) {
        return counter.getNumber() - 1 <= counter.getMin();
    }

    public static void decrement(Counter counter){
        if(isDecrement(counter)){
            counter.setNumber(counter.getNumber()-1);
        }
    }

    public static void increment(Counter counter) {
        if(isIncrement(counter)){
            counter.setNumber(counter.getNumber() + 1);
        }
    }

    public static int getCurrent(Counter counter) {
        return counter.getNumber();
    }
}
