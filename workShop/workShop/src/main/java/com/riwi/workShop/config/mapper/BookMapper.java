package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;
import com.riwi.workShop.domain.entities.Book;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    
    BookResponse bookToBookResponse(Book book);

    Book bookRequestToEntity(BookRequest bookRequest);

    // List<BookResponse> toGetBookList(List<Book> bookList);

    // List<Book> toEntityList(List<BookResponse> getBookList);

}
