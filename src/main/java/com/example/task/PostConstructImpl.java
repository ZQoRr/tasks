package com.example.task;

import com.example.task.model.Author;
import com.example.task.model.Book;
import com.example.task.repository.AuthorRepository;
import com.example.task.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@Component
public class PostConstructImpl {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;
    List<Book> bookList = new LinkedList<>();
    List<Author> authorList = new LinkedList<>();

    Author lermontov = new Author("Lermontov", bookList);
    Author pushkin = new Author("Pushkin", bookList);
    Author chehov = new Author("Chehov", bookList);
    Author fet = new Author("Fet", bookList);
    Book one = new Book("One", authorList);
    Book two = new Book("Two", authorList);
    Book three = new Book("Three", authorList);
    Book four = new Book("Four", authorList);

    @PostConstruct
    public void runAfterObjectCreated(){
    authorList.add(lermontov);
    authorList.add(pushkin);
    authorList.add(chehov);
    authorList.add(fet);

    bookList.add(one);
    bookList.add(two);
    bookList.add(three);
    bookList.add(four);

    authorRepository.saveAndFlush(lermontov);
    authorRepository.saveAndFlush(pushkin);
    authorRepository.saveAndFlush(chehov);
    authorRepository.saveAndFlush(fet);

    bookRepository.saveAndFlush(one);
    bookRepository.saveAndFlush(two);
    bookRepository.saveAndFlush(three);
    bookRepository.saveAndFlush(four);


            }
}
