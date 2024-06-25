package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.UserRequest;
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
    date = "2024-06-25T09:02:03-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse userToUserResponse(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.email( userEntity.getEmail() );
        userResponse.fullName( userEntity.getFullName() );
        userResponse.id( userEntity.getId() );
        List<Loan> list = userEntity.getLoan();
        if ( list != null ) {
            userResponse.loan( new ArrayList<Loan>( list ) );
        }
        userResponse.password( userEntity.getPassword() );
        List<Reservation> list1 = userEntity.getReservation();
        if ( list1 != null ) {
            userResponse.reservation( new ArrayList<Reservation>( list1 ) );
        }
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

        return userEntity.build();
    }

    @Override
    public List<UserResponse> toGetUserList(List<UserEntity> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( userList.size() );
        for ( UserEntity userEntity : userList ) {
            list.add( userToUserResponse( userEntity ) );
        }

        return list;
    }

    @Override
    public List<UserEntity> toEntityList(List<UserResponse> getUserList) {
        if ( getUserList == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( getUserList.size() );
        for ( UserResponse userResponse : getUserList ) {
            list.add( userResponseToUserEntity( userResponse ) );
        }

        return list;
    }

    protected UserEntity userResponseToUserEntity(UserResponse userResponse) {
        if ( userResponse == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.email( userResponse.getEmail() );
        userEntity.fullName( userResponse.getFullName() );
        userEntity.id( userResponse.getId() );
        List<Loan> list = userResponse.getLoan();
        if ( list != null ) {
            userEntity.loan( new ArrayList<Loan>( list ) );
        }
        userEntity.password( userResponse.getPassword() );
        List<Reservation> list1 = userResponse.getReservation();
        if ( list1 != null ) {
            userEntity.reservation( new ArrayList<Reservation>( list1 ) );
        }
        userEntity.role( userResponse.getRole() );
        userEntity.username( userResponse.getUsername() );

        return userEntity.build();
    }
}
