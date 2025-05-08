package com.example.booklist;

import com.example.booklist.model.Book;
import com.example.booklist.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

    public BookStoreApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Book> books = new ArrayList<>();

		books.add(new Book(1L, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, true, 10.99));
		books.add(new Book(2L, "1984", "George Orwell", "Dystopian", 1949, true, 8.99));
		books.add(new Book(3L, "Clean Code", "Robert C. Martin", "Programming", 2008, false, 30.00));
		books.add(new Book(4L, "Moby Dick", "Herman Melville", "Classic", 1851, true, 12.50));
		books.add(new Book(5L, "The Catcher in the Rye", "J.D. Salinger", "Classic", 1951, true, 9.75));
		books.add(new Book(6L, "Effective Java", "Joshua Bloch", "Programming", 2018, true, 35.20));
		books.add(new Book(7L, "Pride and Prejudice", "Jane Austen", "Romance", 1813, false, 11.80));
		books.add(new Book(8L, "The Pragmatic Programmer", "Andrew Hunt", "Programming", 1999, true, 28.45));
		books.add(new Book(9L, "To Kill a Mockingbird", "Harper Lee", "Classic", 1960, true, 7.30));
		books.add(new Book(10L, "Harry Potter", "J.K. Rowling", "Fantasy", 1997, false, 14.00));

        bookRepository.saveAll(books);
	}
}
