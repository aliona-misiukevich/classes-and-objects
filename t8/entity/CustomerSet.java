package com.company.t4.entity;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.company.t4.entity.Customer;

import java.util.*;

public class CustomerSet {
    private List<Customer> customers;

    public CustomerSet(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomerSet() {
        return new ArrayList<Customer>(customers);
    }

    @Override
    public String toString() {
        return "CustomerSet{" +
                "customers=" + customers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerSet that = (CustomerSet) o;
        return Objects.equals(customers, that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }
}