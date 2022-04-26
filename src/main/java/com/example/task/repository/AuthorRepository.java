package com.example.task.repository;

import com.example.task.model.Author;
import com.example.task.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    public Author findAuthorByName(String name);
}
