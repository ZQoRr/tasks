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
    public Book saveBook(String title, List<Author> authors) {
        final Book book = new Book();
        book.setTitle(title);
        book.setAuthors(authors);
        return repository.saveAndFlush(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public List<Book> getBooksByAuthor(Author author) {
        return  repository.findBookByAuthors(author);
    }
}
