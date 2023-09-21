package com.amininjast.library;

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
}
