package com.library.repository;

import java.util.List;
import java.util.ArrayList;
import com.library.entity.Book;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    // Repository methods
    List<Book> books;

    public BookRepository() {
        books = new ArrayList<Book>();
    }
    public List<Book> findAll() {
        return books;
    }

    public Book save(Book book) {
        books.add(book);
        return book;
    }
}
