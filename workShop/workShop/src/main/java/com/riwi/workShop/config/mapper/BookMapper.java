package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.response.GetBook;
import com.riwi.workShop.domain.entities.Book;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    
    GetBook toGetBook(Book book);

    @InheritInverseConfiguration
    Book toEntity(GetBook getBook);

    List<GetBook> toGetBookList(List<Book> bookList);

    List<Book> toEntityList(List<GetBook> getBookList);

}
