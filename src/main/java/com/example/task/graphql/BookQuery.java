package com.example.task.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.task.model.Book;
import com.example.task.service.BookService;
import com.example.task.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQuery implements GraphQLQueryResolver {

    @Autowired
    private BookService service;

    public List<Book> getBooks(){
        return service.getBooks();
    }

    public List<Book> getBooksByAuthor(){
        return service.getBooksByAuthor();
    }


}
