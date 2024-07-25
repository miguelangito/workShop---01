package com.riwi.workShop.config.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;
import com.riwi.workShop.domain.entities.Book;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    
    @Mapping(target = "loan", ignore = true)
    @Mapping(target = "reservation", ignore = true)
    BookResponse bookToBookResponse(Book book);

    @Mapping(target = "loan", ignore = true)
    @Mapping(target = "reservation", ignore = true)
    @Mapping(target = "id", ignore = true)
    Book bookRequestToEntity(BookRequest bookRequest);
}
