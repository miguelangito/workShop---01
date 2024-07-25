package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;
import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.Loan;
import com.riwi.workShop.domain.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T06:43:01-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResponse bookToBookResponse(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponse.BookResponseBuilder bookResponse = BookResponse.builder();

        bookResponse.author( book.getAuthor() );
        bookResponse.genre( book.getGenre() );
        bookResponse.id( book.getId() );
        bookResponse.isbn( book.getIsbn() );
        List<Loan> list = book.getLoan();
        if ( list != null ) {
            bookResponse.loan( new ArrayList<Loan>( list ) );
        }
        bookResponse.publicationYear( book.getPublicationYear() );
        List<Reservation> list1 = book.getReservation();
        if ( list1 != null ) {
            bookResponse.reservation( new ArrayList<Reservation>( list1 ) );
        }
        bookResponse.title( book.getTitle() );

        return bookResponse.build();
    }

    @Override
    public Book bookRequestToEntity(BookRequest bookRequest) {
        if ( bookRequest == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.author( bookRequest.getAuthor() );
        book.genre( bookRequest.getGenre() );
        book.isbn( bookRequest.getIsbn() );
        book.publicationYear( bookRequest.getPublicationYear() );
        book.title( bookRequest.getTitle() );

        return book.build();
    }
}
