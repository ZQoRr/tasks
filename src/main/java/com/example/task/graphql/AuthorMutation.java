package com.example.task.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.task.model.Author;
import com.example.task.service.AuthorService;

public class AuthorMutation implements GraphQLMutationResolver {
    private AuthorService service;

    public Author createPost(String name) {
        return service.saveAuthor(name);
    }
}
