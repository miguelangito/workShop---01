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
    date = "2024-06-25T11:12:13-0500",
    comments = "version: 1.6.0.Beta2, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse userToUserResponse(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( userEntity.getId() );
        userResponse.username( userEntity.getUsername() );
        userResponse.password( userEntity.getPassword() );
        userResponse.email( userEntity.getEmail() );
        userResponse.fullName( userEntity.getFullName() );
        userResponse.role( userEntity.getRole() );
        List<Loan> list = userEntity.getLoan();
        if ( list != null ) {
            userResponse.loan( new ArrayList<Loan>( list ) );
        }
        List<Reservation> list1 = userEntity.getReservation();
        if ( list1 != null ) {
            userResponse.reservation( new ArrayList<Reservation>( list1 ) );
        }

        return userResponse.build();
    }

    @Override
    public UserEntity UserRequestToEntity(UserRequest getUser) {
        if ( getUser == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.username( getUser.getUsername() );
        userEntity.password( getUser.getPassword() );
        userEntity.email( getUser.getEmail() );
        userEntity.fullName( getUser.getFullName() );
        userEntity.role( getUser.getRole() );

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

        userEntity.id( userResponse.getId() );
        userEntity.username( userResponse.getUsername() );
        userEntity.password( userResponse.getPassword() );
        userEntity.email( userResponse.getEmail() );
        userEntity.fullName( userResponse.getFullName() );
        userEntity.role( userResponse.getRole() );
        List<Loan> list = userResponse.getLoan();
        if ( list != null ) {
            userEntity.loan( new ArrayList<Loan>( list ) );
        }
        List<Reservation> list1 = userResponse.getReservation();
        if ( list1 != null ) {
            userEntity.reservation( new ArrayList<Reservation>( list1 ) );
        }

        return userEntity.build();
    }
}
