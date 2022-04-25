package com.example.task.repository;

import com.example.task.model.Author;
import com.example.task.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    public List<Book> findBookByAuthors(Author author);

}
