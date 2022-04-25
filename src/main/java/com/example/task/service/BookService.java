package com.example.task.service;

import com.example.task.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    public List<Book> getBooks();

    public List<Book> getBooksByAuthor();
}
