package com.company.t4.entity;
//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.util.Objects;

public class Airline {
    private String destination;
    private int flightNumber;
    private AircraftType aircraftType;
    private int departureHour;
    private int departureMinute;
    private WeekDays weekDays;


    public Airline(String destination, int flightNumber, AircraftType aircraftType, int departureHour, int departureMinute, WeekDays weekDays){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
        this.weekDays = weekDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(int departureHour) {
        this.departureHour = departureHour;
    }

    public int getDepartureMinute() {
        return departureMinute;
    }

    public void setDepartureMinute(int departureMinute) {
        this.departureMinute = departureMinute;
    }

    public WeekDays getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                departureHour == airline.departureHour &&
                departureMinute == airline.departureMinute &&
                destination.equals(airline.destination) &&
                aircraftType == airline.aircraftType &&
                weekDays == airline.weekDays;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, aircraftType, departureHour, departureMinute, weekDays);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType=" + aircraftType +
                ", departureHour=" + departureHour +
                ", departureMinute=" + departureMinute +
                ", weekDays=" + weekDays +
                '}';
    }
}
