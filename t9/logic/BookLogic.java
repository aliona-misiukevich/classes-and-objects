package com.company.t4.logic;
//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и
// вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import com.company.t4.entity.Book;
import com.company.t4.entity.BookSet;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
    public static List<Book> filterByAuthor(BookSet bookSet, String author) {
        List<Book> filteredSet = new ArrayList<Book>();
        for (Book book : bookSet.getBooks()) {
            if (book.getAuthor().equals(author)) {
                filteredSet.add(book);
            }
        }
        return filteredSet;
    }

    public static List<Book> filterByPublisher(BookSet bookSet, String publisher) {
        List<Book> filteredSet = new ArrayList<Book>();
        for (Book book : bookSet.getBooks()) {
            if (book.getPublisher().equals(publisher)) {
                filteredSet.add(book);
            }
        }
        return filteredSet;
    }

    public static List<Book> filterByYear(BookSet bookSet, int sinceYear) {
        List<Book> filteredSet = new ArrayList<Book>();
        for (Book book : bookSet.getBooks()) {
            if (book.getYearPublishing() == (sinceYear)) {
                filteredSet.add(book);
            }
        }
        return filteredSet;
    }
}
