package com.example.task.service;

import com.example.task.model.Author;
import com.example.task.model.Book;
import com.example.task.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository repository;

    @Autowired
    Author author;

    @Override
    public List<Book> getBooks() {
        return repository.findAll();
    }

    public List<Book> getBooksByAuthor(){
        return repository.findBookByAuthors(author);
    }
}
