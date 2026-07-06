package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void showService() {
        repository.display();
        System.out.println("Book Service called : Book is here");
    }
}