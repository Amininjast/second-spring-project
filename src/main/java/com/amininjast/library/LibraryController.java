package com.amininjast.library;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()

public class LibraryController {
    private final LibraryService libraryService;


    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public List<Book> getBooks() {
        return libraryService.getAllBooks();
    }

    @GetMapping(path = "{bookId}")
    public Optional<Book> getBook(@PathVariable("bookId") Integer bookId) {
        return libraryService.getBook(bookId);
    }

    @PostMapping
    public void registerBook(@RequestBody LibraryRegisterationRequest registerationRequest) {
        libraryService.addBook(registerationRequest);
    }

    @DeleteMapping(path = "{bookId}")
    public void deleteBook(@PathVariable("bookId") Integer bookId) {
        libraryService.deleteBook(bookId);
    }

    @PutMapping(path = "{bookId}")
    public void deleteBook
            (@PathVariable("bookId") Integer bookId,
             @RequestBody LibraryRegisterationRequest updateRequest) {
        libraryService.updateBook(bookId, updateRequest);
    }

}

