package com.book.bookstoreapi.service;

import com.book.bookstoreapi.dto.BookDTO;
import com.book.bookstoreapi.model.Book;
import com.book.bookstoreapi.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookDTO> findBooks(String title, String author) {
        List<Book> books;
        if (title != null && author != null) {
            books = bookRepository.findByTitleContainingAndAuthorContaining(title, author);
        } else if (title != null) {
            books = bookRepository.findByTitleContaining(title);
        } else if (author != null) {
            books = bookRepository.findByAuthorContaining(author);
        } else {
            books = bookRepository.findAll();
        }
        return books.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public Optional<BookDTO> findBookById(Long id) {
        return bookRepository.findById(id).map(this::convertToDTO);
    }

    @Autowired
    private CustomMetrics customMetrics;

    public BookDTO createBook(BookDTO bookDTO) {
        Book book = convertToEntity(bookDTO);
        Book savedBook = bookRepository.save(book);
        customMetrics.incrementBookCreation();
        return convertToDTO(savedBook);
    }


    public Optional<BookDTO> updateBook(Long id, BookDTO bookDTO) {
        if (bookRepository.existsById(id)) {
            Book book = convertToEntity(bookDTO);
            book.setId(id);
            Book updatedBook = bookRepository.save(book);
            return Optional.of(convertToDTO(updatedBook));
        }
        return Optional.empty();
    }

    public boolean deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private BookDTO convertToDTO(Book book) {
        BookDTO dto = new BookDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setPrice(book.getPrice());
        dto.setIsbn(book.getIsbn());
        return dto;
    }

    private Book convertToEntity(BookDTO dto) {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPrice(dto.getPrice());
        book.setIsbn(dto.getIsbn());
        return book;
    }
}
