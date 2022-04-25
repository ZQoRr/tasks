//package com.example.task;
//
//import com.example.task.model.Author;
//import com.example.task.model.Book;
//import com.example.task.repository.AuthorRepository;
//import com.example.task.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.LinkedList;
//import java.util.List;
//
//@Component
//public class CommandLinerImpl implements CommandLineRunner {
//
//    @Autowired
//    BookRepository bookRepository;
//
//    @Autowired
//    AuthorRepository authorRepository;
//    List<Book> bookList = new LinkedList<>();
//    List<Author> authorList = new LinkedList<>();
//
//    Author author = new Author();
//    Book book = new Book();
//    @Override
//    public void run(String... args) throws Exception {
//
//        bookList.add(book);
//        authorList.add(author);
//
//        book.setAuthors(authorList);
//        book.setId(1L);
//        book.setTitle("One");
//
//        author.setBooks(bookList);
//        author.setId(1L);
//        author.setName("Lermontov");
//
//        bookRepository.saveAndFlush(book);
//        authorRepository.saveAndFlush(author);
//
//
//
//
//
//    }
//}
