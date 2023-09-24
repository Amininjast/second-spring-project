package com.amininjast.library;

import com.amininjast.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    private final LibraryDao libraryDao;

    public LibraryService(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    public List<Book> getAllBooks() {
        return libraryDao.selectAllBooks();
    }

    public Book getBook(Integer bookId) {
        return libraryDao.selectBookById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException("book not found"));
    }

    public void addBook(LibraryRegisterationRequest request) {
        Book book = new Book(request.bookName());
        libraryDao.insertBook(book);
    }

    public void deleteBook(Integer bookId) {
        libraryDao.deleteBookById(bookId);
    }

    public void updateBook(Integer bookId, LibraryRegisterationRequest updateRequest) {
        Book book = getBook(bookId);
        libraryDao.updateBook(book);
    }
}
