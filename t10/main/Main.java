package com.company.t4.main;
//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import com.company.t4.entity.AircraftType;
import com.company.t4.entity.Airline;
import com.company.t4.entity.Airport;
import com.company.t4.entity.WeekDays;
import com.company.t4.logic.AirlineLogic;
import com.company.t4.view.Print;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Airline> airlines = new ArrayList<Airline>();
        airlines.add(new Airline("ASC", 123, AircraftType.valueOf("Airbus"), 12, 45, WeekDays.valueOf("Sunday")) );
        airlines.add(new Airline("BCN", 345, AircraftType.valueOf("Boeing"), 10, 25, WeekDays.valueOf("Monday")) );
        airlines.add(new Airline("ALC", 678, AircraftType.valueOf("Embraer"), 9, 10, WeekDays.valueOf("Wednesday")) );
        airlines.add(new Airline("ASC", 567, AircraftType.valueOf("Embraer"), 12, 15, WeekDays.valueOf("Monday")) );

        Airport airport = new Airport(airlines);

        List<Airline> filteredSet = AirlineLogic.filterByDestination(airport, "ASC");
        Print.printList(filteredSet);

    }
}
