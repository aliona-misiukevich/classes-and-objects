package com.company.t4.main;
//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и
// вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import com.company.t4.entity.Book;
import com.company.t4.entity.BookSet;
import com.company.t4.logic.BookLogic;
import com.company.t4.view.Print;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "aaa", "q", "werty", 2019, 45, true));
        books.add(new Book(2, "bbb", "qa", "rfv", 2018, 35, false));
        books.add(new Book(3, "ccc", "qaz", "edc", 1950, 20, true));
        books.add(new Book(4, "ddd", "q", "tgb", 2019, 15, false));
        books.add(new Book(5, "fff", "qx", "yhn", 2012, 70, true));
        BookSet set = new BookSet(books);
        List<Book> filteredBooksByAuthor = BookLogic.filterByAuthor(set, "q");

        Print.printList(filteredBooksByAuthor);
    }
}
