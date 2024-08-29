package com.book.bookstoreapi;

import com.book.bookstoreapi.controller.BookController;
import com.book.bookstoreapi.dto.BookDTO;
import com.book.bookstoreapi.service.BookService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @InjectMocks
    private BookController bookController;

    @Mock
    private BookService bookService;

    private MockMvc mockMvc;

    @Test
    public void testGetAllBooks() throws Exception {
        mockMvc.perform(get("/books"))
               .andExpect(status().isOk());
    }

    @GetMapping
    public List<BookDTO> getAllBooks(@RequestParam(required = false) String title, @RequestParam(required = false) String author) {
        return bookService.findBooks(title, author);
    }

}
