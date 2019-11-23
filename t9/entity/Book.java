package com.company.t4.entity;
//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и
// вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.Objects;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private String publisher;
    private int yearPublishing;
    private int numberOfPages;
    private boolean softCover;

    public Book(int id, String bookName, String author, String publisher, int yearPublishing, int numberOfPages, boolean softCover) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.yearPublishing = yearPublishing;
        this.numberOfPages = numberOfPages;
        this.softCover = softCover;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isSoftCover() {
        return softCover;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setSoftCover(boolean softCover) {
        this.softCover = softCover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                yearPublishing == book.yearPublishing &&
                numberOfPages == book.numberOfPages &&
                softCover == book.softCover &&
                bookName.equals(book.bookName) &&
                author.equals(book.author) &&
                publisher.equals(book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, author, publisher, yearPublishing, numberOfPages, softCover);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", numberOfPages=" + numberOfPages +
                ", softCover=" + softCover +
                '}';
    }
}
