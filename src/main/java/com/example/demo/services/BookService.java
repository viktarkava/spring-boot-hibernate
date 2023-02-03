package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }
}