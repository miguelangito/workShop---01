package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.get_mapping.GetBook;
import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.Loan;
import com.riwi.workShop.domain.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-25T08:27:20-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public GetBook toGetBook(Book book) {
        if ( book == null ) {
            return null;
        }

        GetBook.GetBookBuilder getBook = GetBook.builder();

        getBook.author( book.getAuthor() );
        getBook.genre( book.getGenre() );
        getBook.id( book.getId() );
        getBook.isbn( book.getIsbn() );
        List<Loan> list = book.getLoan();
        if ( list != null ) {
            getBook.loan( new ArrayList<Loan>( list ) );
        }
        getBook.publicationYear( book.getPublicationYear() );
        List<Reservation> list1 = book.getReservation();
        if ( list1 != null ) {
            getBook.reservation( new ArrayList<Reservation>( list1 ) );
        }
        getBook.title( book.getTitle() );

        return getBook.build();
    }

    @Override
    public Book toEntity(GetBook getBook) {
        if ( getBook == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.author( getBook.getAuthor() );
        book.genre( getBook.getGenre() );
        book.id( getBook.getId() );
        book.isbn( getBook.getIsbn() );
        List<Loan> list = getBook.getLoan();
        if ( list != null ) {
            book.loan( new ArrayList<Loan>( list ) );
        }
        book.publicationYear( getBook.getPublicationYear() );
        List<Reservation> list1 = getBook.getReservation();
        if ( list1 != null ) {
            book.reservation( new ArrayList<Reservation>( list1 ) );
        }
        book.title( getBook.getTitle() );

        return book.build();
    }

    @Override
    public List<GetBook> toGetBookList(List<Book> bookList) {
        if ( bookList == null ) {
            return null;
        }

        List<GetBook> list = new ArrayList<GetBook>( bookList.size() );
        for ( Book book : bookList ) {
            list.add( toGetBook( book ) );
        }

        return list;
    }

    @Override
    public List<Book> toEntityList(List<GetBook> getBookList) {
        if ( getBookList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( getBookList.size() );
        for ( GetBook getBook : getBookList ) {
            list.add( toEntity( getBook ) );
        }

        return list;
    }
}
