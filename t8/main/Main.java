package com.company.t4.main;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. З
// задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.company.t4.entity.Customer;
import com.company.t4.entity.CustomerSet;
import com.company.t4.view.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "AAA", "ZZZ", "XXX", "qwerty", 123, 56));
        customers.add(new Customer(2, "SSS", "QQQ", "EEE", "asdfgg", 453, 78));
        customers.add(new Customer(3, "VVV", "SSS", "Киев", "ghjkl", 113, 32));
        customers.add(new Customer(4, "FFF ", "RRR", "XXX", "zxcvb", 132, 13));

        CustomerSet set = new CustomerSet(customers);

        Print.printListOfCustomersByName(set);

        Print.printFilteredByCardNumber(set, 111, 333);
    }


}
