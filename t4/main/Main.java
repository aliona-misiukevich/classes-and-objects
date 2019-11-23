package com.company.t4.main;
//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import com.company.t4.view.Print;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a train number:");

        int number = sc.nextInt();
        Depo depo = new Depo(
                new Train("BNC", 12, 13, 45),
                new Train("ALC", 23, 13, 25),
                new Train("BCN", 42, 11, 35),
                new Train("ACE", 45, 10, 35),
                new Train("ALC", 34, 11, 00)
        );

        Print.printTrainInfo(depo, number);

    }
}
