package com.book.bookstore.mapper;

import com.book.bookstore.dto.BookDTO;
import com.book.bookstore.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO toDTO(Book book);
    Book toEntity(BookDTO bookDTO);
}
