package com.company.t4.main;
//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.Objects;

public class Train {
    private String destination;
    private int trainNumber;
    private int destinationHours;
    private int destinationMinutes;

    public Train(String destination, int trainNumber, int hours, int minutes) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.destinationHours = hours;
        this.destinationMinutes = minutes;
    }

    public String getDestination() { return destination; }

    public int getTrainNumber() {return trainNumber;}

    public int getTime() { return destinationHours + ' ' + destinationMinutes;}

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDestinationHours(int destinationHours) {
        this.destinationHours = destinationHours;
    }

    public void setDestinationMinutes(int destinationMinutes) {
        this.destinationMinutes = destinationMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                destinationHours == train.destinationHours &&
                destinationMinutes == train.destinationMinutes &&
                destination.equals(train.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, trainNumber, destinationHours, destinationMinutes);
    }

    @Override
    public String toString() {
       return String.format("%s %d %d:%d", destination, trainNumber, destinationHours, destinationMinutes);
    }

}
