package com.company.t4.entity;

import java.util.List;
import java.util.Objects;

public class BookSet {
    private List<Book> books;

    public BookSet(List<Book> books){
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSet bookSet = (BookSet) o;
        return books.equals(bookSet.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "BookSet{" +
                "books=" + books +
                '}';
    }
}
