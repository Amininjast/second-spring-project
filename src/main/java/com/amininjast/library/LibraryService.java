package com.amininjast.library;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    private final LibraryDao libraryDao;

    public LibraryService(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    public List<Book> getAllBooks() {
        return libraryDao.selectAllBooks();
    }

    public Optional<Book> getBook(Integer bookId) {
        return libraryDao.selectBookById(bookId);
    }

    public void addBook(LibraryRegisterationRequest request) {
        Book book = new Book(request.bookName());
        libraryDao.insertBook(book);
    }

    public void deleteBook(Integer bookId) {
        libraryDao.deleteBookById(bookId);
    }

    public void updateBook(Integer bookId, LibraryRegisterationRequest updateRequest) {
        Optional<Book> book = getBook(bookId);
        libraryDao.updateBook(book);
    }
}
