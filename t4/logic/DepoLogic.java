package com.company.t4.logic;

import com.company.t4.main.Depo;
import com.company.t4.main.Train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DepoLogic {

    public static List<Train> sortByTrainNumber(Depo depo){
        List<Train> trains = new ArrayList<Train>(depo.getTrains());

        for (int i = 0; i < trains.size() - 1; i++) {
            for (int j = i + 1; j < trains.size(); j++){
                if(trains.get(i).getTrainNumber() > trains.get(j).getTrainNumber()) {
                    Train temp = trains.get(i);
                    trains.set(i, trains.get(j));
                    trains.set(j, temp);
                }
            }
        }
        return trains;
    }

    public static List<Train> sortByDestination(Depo depo) {
        List<Train> trains = new ArrayList<Train>(depo.getTrains());
        //comparator
        Comparator<Train> comparator = Comparator
                .comparing(t -> t.getDestination());
        comparator = comparator.thenComparing(t -> t.getTime());
        Collections.sort(trains, comparator);
        return trains;
    }
}
