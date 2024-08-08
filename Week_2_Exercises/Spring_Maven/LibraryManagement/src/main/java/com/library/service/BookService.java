package Week_2_Exercises.Spring_Maven.LibraryManagement.src.main.java.com.library.service;
import Week_2_Exercises.Spring_Maven.LibraryManagement.com.library.entity.*;
import Week_2_Exercises.Spring_Maven.LibraryManagement.com.library.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
