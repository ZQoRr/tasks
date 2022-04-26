package com.example.task.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.task.model.Author;
import com.example.task.model.Book;
import com.example.task.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorMutation implements GraphQLMutationResolver {
    @Autowired
    private AuthorService service;

    public Author saveAuthor(String name, List<Book> books) {
        return service.saveAuthor(name,books);
    }
}
