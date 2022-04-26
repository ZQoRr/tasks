package com.example.task.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.task.model.Author;
import com.example.task.model.Book;
import com.example.task.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookMutation implements GraphQLMutationResolver {

    @Autowired
    private BookService bookService;

    public Book saveBook(String title, List<Author> authors){
        return bookService.saveBook(title, authors);
    }
}
