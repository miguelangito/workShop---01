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
    date = "2024-07-08T10:47:18-0500",
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

    @Override
    public List<BookResponse> toGetBookList(List<Book> bookList) {
        if ( bookList == null ) {
            return null;
        }

        List<BookResponse> list = new ArrayList<BookResponse>( bookList.size() );
        for ( Book book : bookList ) {
            list.add( bookToBookResponse( book ) );
        }

        return list;
    }

    @Override
    public List<Book> toEntityList(List<BookResponse> getBookList) {
        if ( getBookList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( getBookList.size() );
        for ( BookResponse bookResponse : getBookList ) {
            list.add( bookResponseToBook( bookResponse ) );
        }

        return list;
    }

    protected Book bookResponseToBook(BookResponse bookResponse) {
        if ( bookResponse == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.author( bookResponse.getAuthor() );
        book.genre( bookResponse.getGenre() );
        book.id( bookResponse.getId() );
        book.isbn( bookResponse.getIsbn() );
        List<Loan> list = bookResponse.getLoan();
        if ( list != null ) {
            book.loan( new ArrayList<Loan>( list ) );
        }
        book.publicationYear( bookResponse.getPublicationYear() );
        List<Reservation> list1 = bookResponse.getReservation();
        if ( list1 != null ) {
            book.reservation( new ArrayList<Reservation>( list1 ) );
        }
        book.title( bookResponse.getTitle() );

        return book.build();
    }
}
