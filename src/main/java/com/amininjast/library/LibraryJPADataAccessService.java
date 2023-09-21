package com.amininjast.library;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jpa")
public class LibraryJPADataAccessService implements LibraryDao {
    private final LibraryRepository libraryRepository;

    public LibraryJPADataAccessService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public List<Book> selectAllBooks() {
        return libraryRepository.findAll();
    }
}
