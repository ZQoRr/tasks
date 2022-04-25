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
    public Author addAuthor(Author author) {
       Author saveAuthor = repository.saveAndFlush(author);
       return saveAuthor;
    }

    @Override
    public Author saveAuthor(String name) {
        final Author author = new Author();
        author.setName(name);
        return repository.save(author);
    }

    public Author getAuthor(long id) {
        return repository.getById(id);
    }

    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    @Override
    public List<Author> getBooks() {
        return repository.findAll();
    }
}
