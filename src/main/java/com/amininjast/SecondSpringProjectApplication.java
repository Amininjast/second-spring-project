package com.amininjast;

import com.amininjast.library.Book;
import com.amininjast.library.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SecondSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LibraryRepository libraryRepository) {
		return args -> {
			Book book1 = new Book(
					1,
					"Book1"
			);
			Book book2 = new Book(
					2,
					"Book2"
			);
			List<Book> books = List.of(book1, book2);
			libraryRepository.saveAll(books);
		};
	}
}
