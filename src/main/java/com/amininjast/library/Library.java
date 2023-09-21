package com.amininjast.library;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Library {
    @Id
    @SequenceGenerator(name = "library_id_sequence", sequenceName = "library_id_sequence")
    @GeneratedValue(generator = "library_id_sequence", strategy = GenerationType.SEQUENCE)
    private Integer bookId;
    @Column(nullable = false)
    private String bookName;

    public Library() {
    }

    public Library(String bookName) {
        this.bookName = bookName;
    }

    public Library(Integer bookId, String bookName) {
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
        Library library = (Library) o;
        return Objects.equals(bookId, library.bookId) && Objects.equals(bookName, library.bookName);
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
