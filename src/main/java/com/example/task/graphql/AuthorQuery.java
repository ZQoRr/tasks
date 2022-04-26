package com.example.task.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.task.model.Author;
import com.example.task.model.Book;
import com.example.task.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorQuery implements GraphQLQueryResolver {

    @Autowired
    private AuthorService service;

    public Author getAuthor(String name) {
        return service.getAuthor(name);
    }

    public List<Author> getAuthors(){
        return service.getAllAuthors();
    }


}
