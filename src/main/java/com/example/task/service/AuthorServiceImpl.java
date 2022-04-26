package com.example.task.service;

import com.example.task.model.Author;
import com.example.task.model.Book;
import com.example.task.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository repository;


    @Override
    public Author saveAuthor(String name, List<Book> books) {
        final Author author = new Author();
        author.setName(name);
        author.setBooks(books);
        return repository.save(author);
    }


    @Override
    public Author getAuthor(String name) {
        return repository.findAuthorByName(name);
    }


    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

}
