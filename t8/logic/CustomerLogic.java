package com.company.t4.logic;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.company.t4.entity.Customer;
import com.company.t4.entity.CustomerSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {

    public static Comparator<Customer> nameComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
            return (o1.getName().compareTo(o2.getName()));
        }
    };

    public static List<Customer> getCustomersSortedByName(CustomerSet customerSet) {
        List<Customer> newCustomers = customerSet.getCustomerSet();
        Collections.sort(newCustomers, nameComparator);
        return newCustomers;
    }

    public static List<Customer> createListByCardNumber(CustomerSet customerSet, int start, int end){
        List<Customer> newCustomers = new ArrayList<Customer>();
        for (Customer customer : customerSet.getCustomerSet() ) {
            if(customer.getCardNumber() >= start && customer.getCardNumber() <= end) {
                newCustomers.add(customer);
            }
        }
        return newCustomers;
    }

}
