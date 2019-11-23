package com.company.t4.main;

import java.util.Arrays;
import java.util.List;

public class Depo {

    private List<Train> trains;

    public Depo(Train ... trains){
        this.trains = Arrays.asList(trains);
    }

    public List<Train> getTrains() { return trains;}

    public Train getTrain(int number) {
        for (Train train: getTrains()) {
            if(train.getTrainNumber() == number) {
                return train;
            }
        }
        return null;
    }
}
