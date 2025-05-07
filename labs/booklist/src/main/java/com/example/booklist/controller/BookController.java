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
        bookRepository.add(book);
        return "redirect:/books";
    }

    @GetMapping("/{index}")
    public String getBook(@PathVariable Integer index, Model model) {
        model.addAttribute("book", bookRepository.findByIndex(index));
        model.addAttribute("index", index);
        return "books/book-form";
    }

    @PostMapping("/update/{index}")
    public String updateBook(@PathVariable Integer index, @ModelAttribute Book book, Model model) {
        bookRepository.save(index, book);
        return "redirect:/books";
    }

    @PostMapping("/delete/{index}")
    public String deleteBook(@PathVariable Integer index, Model model) {
        bookRepository.remove(index);
        return "redirect:/books";
    }
}
