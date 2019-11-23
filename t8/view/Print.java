package com.company.t4.view;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.company.t4.entity.Customer;
import com.company.t4.entity.CustomerSet;
import com.company.t4.logic.CustomerLogic;
import java.util.List;

public class Print {

    public static void printListOfCustomersByName(CustomerSet customerSet) {
        List<Customer> sortedCustomers = CustomerLogic.getCustomersSortedByName(customerSet);
        for (Customer customer : sortedCustomers) {
            System.out.println(customer.toString());
        }
    }

    public static void printFilteredByCardNumber(CustomerSet customerSet, int start, int end) {
        List<Customer> filteredCustomers = CustomerLogic.createListByCardNumber(customerSet, start, end);
        for (Customer customer : filteredCustomers) {
            System.out.println(customer.toString());
        }
    }
}
