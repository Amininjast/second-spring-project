package com.amininjast.library;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Book {
    @Id
    @SequenceGenerator(name = "book_id_sequence", sequenceName = "book_id_sequence")
    @GeneratedValue(generator = "book_id_sequence", strategy = GenerationType.SEQUENCE)
    private Integer bookId;

    @Column(nullable = false)
    private String bookName;

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(Integer bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName);
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
