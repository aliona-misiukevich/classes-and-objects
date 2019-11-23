package com.company.t4.view;

import com.company.t4.entity.Book;
import com.company.t4.entity.BookSet;

import java.util.List;

public class Print {
    public static void printList(List<Book> books) {
        for (Book book: books) {
            System.out.println(book.toString());
        }
    }
}
