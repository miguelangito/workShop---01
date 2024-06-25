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
    date = "2024-06-25T11:12:13-0500",
    comments = "version: 1.6.0.Beta2, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResponse bookToBookResponse(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponse.BookResponseBuilder bookResponse = BookResponse.builder();

        bookResponse.id( book.getId() );
        bookResponse.title( book.getTitle() );
        bookResponse.author( book.getAuthor() );
        bookResponse.publicationYear( book.getPublicationYear() );
        bookResponse.genre( book.getGenre() );
        bookResponse.isbn( book.getIsbn() );
        List<Loan> list = book.getLoan();
        if ( list != null ) {
            bookResponse.loan( new ArrayList<Loan>( list ) );
        }
        List<Reservation> list1 = book.getReservation();
        if ( list1 != null ) {
            bookResponse.reservation( new ArrayList<Reservation>( list1 ) );
        }

        return bookResponse.build();
    }

    @Override
    public Book bookRequestToEntity(BookRequest bookRequest) {
        if ( bookRequest == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.title( bookRequest.getTitle() );
        book.author( bookRequest.getAuthor() );
        book.publicationYear( bookRequest.getPublicationYear() );
        book.genre( bookRequest.getGenre() );
        book.isbn( bookRequest.getIsbn() );

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

        book.id( bookResponse.getId() );
        book.title( bookResponse.getTitle() );
        book.author( bookResponse.getAuthor() );
        book.publicationYear( bookResponse.getPublicationYear() );
        book.genre( bookResponse.getGenre() );
        book.isbn( bookResponse.getIsbn() );
        List<Loan> list = bookResponse.getLoan();
        if ( list != null ) {
            book.loan( new ArrayList<Loan>( list ) );
        }
        List<Reservation> list1 = bookResponse.getReservation();
        if ( list1 != null ) {
            book.reservation( new ArrayList<Reservation>( list1 ) );
        }

        return book.build();
    }
}
