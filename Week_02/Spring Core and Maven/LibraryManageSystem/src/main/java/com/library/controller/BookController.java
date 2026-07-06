package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository repository;

    @PostMapping
    public Book addBook(@RequestBody Book book){

        return repository.save(book);

    }

    @GetMapping
    public List<Book> getBooks(){

        return repository.findAll();

    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){

        repository.deleteById(id);

        return "Book deleted";

    }
}