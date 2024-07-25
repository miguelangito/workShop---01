package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.LoanRequest;
import com.riwi.workShop.api.dto.response.BookResponseEmpty;
import com.riwi.workShop.api.dto.response.LoanResponse;
import com.riwi.workShop.api.dto.response.UserResponseEmpty;
import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.Loan;
import com.riwi.workShop.domain.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T08:25:03-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public Loan loanRequestToEntity(LoanRequest loanRequest) {
        if ( loanRequest == null ) {
            return null;
        }

        Loan.LoanBuilder loan = Loan.builder();

        loan.loanUserEntity( loanRequestToUserEntity( loanRequest ) );
        loan.loanBook( loanRequestToBook( loanRequest ) );
        loan.loanDate( loanRequest.getLoanDate() );
        loan.returnDate( loanRequest.getReturnDate() );
        loan.status( loanRequest.getStatus() );

        return loan.build();
    }

    @Override
    public LoanResponse loanToLoanResponse(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanResponse.LoanResponseBuilder loanResponse = LoanResponse.builder();

        loanResponse.user( userEntityToUserResponseEmpty( loan.getLoanUserEntity() ) );
        loanResponse.book( bookToBookResponseEmpty( loan.getLoanBook() ) );
        loanResponse.id( loan.getId() );
        loanResponse.loanDate( loan.getLoanDate() );
        loanResponse.returnDate( loan.getReturnDate() );
        loanResponse.status( loan.getStatus() );

        return loanResponse.build();
    }

    protected UserEntity loanRequestToUserEntity(LoanRequest loanRequest) {
        if ( loanRequest == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( loanRequest.getUserId() );

        return userEntity.build();
    }

    protected Book loanRequestToBook(LoanRequest loanRequest) {
        if ( loanRequest == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.id( loanRequest.getBookId() );

        return book.build();
    }

    protected UserResponseEmpty userEntityToUserResponseEmpty(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponseEmpty.UserResponseEmptyBuilder userResponseEmpty = UserResponseEmpty.builder();

        userResponseEmpty.id( userEntity.getId() );
        userResponseEmpty.email( userEntity.getEmail() );
        userResponseEmpty.fullName( userEntity.getFullName() );
        userResponseEmpty.password( userEntity.getPassword() );
        userResponseEmpty.role( userEntity.getRole() );
        userResponseEmpty.username( userEntity.getUsername() );

        return userResponseEmpty.build();
    }

    protected BookResponseEmpty bookToBookResponseEmpty(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponseEmpty.BookResponseEmptyBuilder bookResponseEmpty = BookResponseEmpty.builder();

        bookResponseEmpty.id( book.getId() );
        bookResponseEmpty.author( book.getAuthor() );
        bookResponseEmpty.genre( book.getGenre() );
        bookResponseEmpty.isbn( book.getIsbn() );
        bookResponseEmpty.publicationYear( book.getPublicationYear() );
        bookResponseEmpty.title( book.getTitle() );

        return bookResponseEmpty.build();
    }
}
