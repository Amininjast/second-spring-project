package com.amininjast.library;

import java.util.List;
import java.util.Optional;

public interface LibraryDao {
    List<Book> selectAllBooks();

    Optional<Book> selectBookById(Integer bookId);

    void insertBook(Book book);

    void deleteBookById(Integer bookId);

    void updateBook(Book book);
}
