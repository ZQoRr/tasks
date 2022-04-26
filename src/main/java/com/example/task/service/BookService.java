package com.example.task.service;

import com.example.task.model.Author;
import com.example.task.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    public Book saveBook(String title, List<Author> authors);
    public List<Book> getAllBooks();

    public List<Book> getBooksByAuthor(Author author);
}
