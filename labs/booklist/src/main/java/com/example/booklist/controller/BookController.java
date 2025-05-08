package com.example.booklist.controller;

import com.example.booklist.model.Book;
import com.example.booklist.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books/books-list";
    }

    @GetMapping("/new")
    public String newBook(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("index", -1);
        return "books/book-form";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute Book book, Model model) {
        bookRepository.save(book);
        return "redirect:/books";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookRepository.findById(id).orElseThrow());
        return "books/book-form";
    }

    @PostMapping("/update/{id}")
    public String updateBook(@ModelAttribute Book book, Model model) {
        bookRepository.save(book);
        return "redirect:/books";
    }

    @PostMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id, Model model) {
        bookRepository.deleteById(id);
        return "redirect:/books";
    }
}
