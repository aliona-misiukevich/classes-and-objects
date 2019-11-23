package com.company.t4.logic;
//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import com.company.t4.entity.Airline;
import com.company.t4.entity.Airport;
import com.company.t4.entity.WeekDays;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

    public static List<Airline> filterByDestination(Airport airlines, String dest) {
        List<Airline> filteredSet = new ArrayList<Airline>();
        for (Airline airline : airlines.getAirlines()) {
            if (airline.getDestination().equals(dest)) {
                filteredSet.add(airline);
            }
        }
        return filteredSet;
    }

    public static List<Airline> filterByWeekDay(Airport airlines, WeekDays weekDays) {
        List<Airline> filteredSet = new ArrayList<Airline>();
        for (Airline airline : airlines.getAirlines()) {
            if (airline.getWeekDays().equals(weekDays)) {
                filteredSet.add(airline);
            }
        }
        return filteredSet;
    }

    public static List<Airline> filterByWeekDayAndTime(Airport airlines, WeekDays weekDays, int departureHour, int departureMinute) {
        List<Airline> filteredSet = new ArrayList<Airline>();
        for (Airline airline : airlines.getAirlines()) {
            if (airline.getDepartureHour() > departureHour) {
                if (airline.getDepartureMinute() > departureMinute) {
                    if (airline.getWeekDays().equals(weekDays)) {
                        filteredSet.add(airline);
                    }
                }
            }
        }
        return filteredSet;
    }
}
