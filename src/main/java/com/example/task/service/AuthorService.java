package com.example.task.service;

import com.example.task.model.Author;
import com.example.task.model.Book;

import java.util.List;

public interface AuthorService {

    public Author saveAuthor(String name, List<Book> books);
    public Author getAuthor(String name);

    public List<Author> getAllAuthors();
}
