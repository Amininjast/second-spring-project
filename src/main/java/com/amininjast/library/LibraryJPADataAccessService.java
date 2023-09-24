package com.amininjast.library;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Book> selectBookById(Integer bookId) {
        return libraryRepository.findById(bookId);
    }

    @Override
    public void insertBook(Book book) {
        libraryRepository.save(book);
    }

    @Override
    public void deleteBookById(Integer bookId) {
        libraryRepository.deleteById(bookId);
    }

    @Override
    public void updateBook(Book book) {
        libraryRepository.save(book);
    }
}
