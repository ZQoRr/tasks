package com.example.task.service;

import com.example.task.model.Author;
import com.example.task.model.Book;

import java.util.List;

public interface AuthorService {

    public Author addAuthor(Author author);

    public Author saveAuthor(String name);

    public Author getAuthor(long id);

    public List<Author> getAllAuthors();

    public List<Author> getBooks();

}
