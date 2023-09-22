package com.amininjast.library;

import java.util.List;

public interface LibraryDao {
    List<Book> selectAllBooks();

    Book selectBookById(Integer bookId);

    void insertBook(Book book);

    void deleteBookById(Integer bookId);

    void updateBook(Book book);
}
