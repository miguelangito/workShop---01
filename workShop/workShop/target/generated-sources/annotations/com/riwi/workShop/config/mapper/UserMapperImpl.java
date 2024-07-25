package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.UserRequest;
import com.riwi.workShop.api.dto.response.LoanResponseEmpty;
import com.riwi.workShop.api.dto.response.ReservationResponseEmpty;
import com.riwi.workShop.api.dto.response.UserResponse;
import com.riwi.workShop.domain.entities.Loan;
import com.riwi.workShop.domain.entities.Reservation;
import com.riwi.workShop.domain.entities.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-25T10:09:54-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse userToUserResponse(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.loan( loanListToLoanResponseEmptyList( userEntity.getLoan() ) );
        userResponse.reservation( reservationListToReservationResponseEmptyList( userEntity.getReservation() ) );
        userResponse.email( userEntity.getEmail() );
        userResponse.fullName( userEntity.getFullName() );
        userResponse.id( userEntity.getId() );
        userResponse.password( userEntity.getPassword() );
        userResponse.role( userEntity.getRole() );
        userResponse.username( userEntity.getUsername() );

        return userResponse.build();
    }

    @Override
    public UserEntity UserRequestToEntity(UserRequest getUser) {
        if ( getUser == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.email( getUser.getEmail() );
        userEntity.fullName( getUser.getFullName() );
        userEntity.password( getUser.getPassword() );
        userEntity.role( getUser.getRole() );
        userEntity.username( getUser.getUsername() );

        return userEntity.build();
    }

    protected LoanResponseEmpty loanToLoanResponseEmpty(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanResponseEmpty.LoanResponseEmptyBuilder loanResponseEmpty = LoanResponseEmpty.builder();

        loanResponseEmpty.id( loan.getId() );
        loanResponseEmpty.loanDate( loan.getLoanDate() );
        loanResponseEmpty.returnDate( loan.getReturnDate() );
        loanResponseEmpty.status( loan.getStatus() );

        return loanResponseEmpty.build();
    }

    protected List<LoanResponseEmpty> loanListToLoanResponseEmptyList(List<Loan> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanResponseEmpty> list1 = new ArrayList<LoanResponseEmpty>( list.size() );
        for ( Loan loan : list ) {
            list1.add( loanToLoanResponseEmpty( loan ) );
        }

        return list1;
    }

    protected ReservationResponseEmpty reservationToReservationResponseEmpty(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResponseEmpty.ReservationResponseEmptyBuilder reservationResponseEmpty = ReservationResponseEmpty.builder();

        reservationResponseEmpty.reservationDate( reservation.getReservationDate() );
        reservationResponseEmpty.status( reservation.isStatus() );

        return reservationResponseEmpty.build();
    }

    protected List<ReservationResponseEmpty> reservationListToReservationResponseEmptyList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<ReservationResponseEmpty> list1 = new ArrayList<ReservationResponseEmpty>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( reservationToReservationResponseEmpty( reservation ) );
        }

        return list1;
    }
}
