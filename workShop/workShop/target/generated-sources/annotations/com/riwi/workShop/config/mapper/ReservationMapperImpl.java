package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.BookResponseEmpty;
import com.riwi.workShop.api.dto.response.ReservationResponse;
import com.riwi.workShop.api.dto.response.UserResponseEmpty;
import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.Reservation;
import com.riwi.workShop.domain.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T08:31:21-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation reservationRequestToEntity(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.reservationUserEntity( reservationRequestToUserEntity( reservationRequest ) );
        reservation.reservationBook( reservationRequestToBook( reservationRequest ) );
        reservation.reservationDate( reservationRequest.getReservationDate() );
        reservation.status( reservationRequest.isStatus() );

        return reservation.build();
    }

    @Override
    public ReservationResponse reservationToReservationResponse(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResponse.ReservationResponseBuilder reservationResponse = ReservationResponse.builder();

        reservationResponse.user( userEntityToUserResponseEmpty( reservation.getReservationUserEntity() ) );
        reservationResponse.book( bookToBookResponseEmpty( reservation.getReservationBook() ) );
        reservationResponse.reservationDate( reservation.getReservationDate() );
        reservationResponse.status( reservation.isStatus() );

        return reservationResponse.build();
    }

    protected UserEntity reservationRequestToUserEntity(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( reservationRequest.getUserId() );

        return userEntity.build();
    }

    protected Book reservationRequestToBook(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.id( reservationRequest.getBookId() );

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
