package com.example.booklist.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "book_id")
    private Long id;
    private String title;
    private String author;
    private String genre;
    private int year;
    private boolean inStock;
    private double price;

    public Book(Long id, String title, String author, String genre, int year, boolean inStock, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.inStock = inStock;
        this.price = price;
    }

    public Book() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
