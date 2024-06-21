package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.response.GetUser;
import com.riwi.workShop.domain.entities.Loan;
import com.riwi.workShop.domain.entities.Reservation;
import com.riwi.workShop.domain.entities.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T11:31:50-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public GetUser toGetUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        GetUser.GetUserBuilder getUser = GetUser.builder();

        getUser.email( userEntity.getEmail() );
        getUser.fullName( userEntity.getFullName() );
        getUser.id( userEntity.getId() );
        List<Loan> list = userEntity.getLoan();
        if ( list != null ) {
            getUser.loan( new ArrayList<Loan>( list ) );
        }
        getUser.password( userEntity.getPassword() );
        List<Reservation> list1 = userEntity.getReservation();
        if ( list1 != null ) {
            getUser.reservation( new ArrayList<Reservation>( list1 ) );
        }
        getUser.role( userEntity.getRole() );
        getUser.username( userEntity.getUsername() );

        return getUser.build();
    }

    @Override
    public UserEntity toEntity(GetUser getUser) {
        if ( getUser == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.email( getUser.getEmail() );
        userEntity.fullName( getUser.getFullName() );
        userEntity.id( getUser.getId() );
        List<Loan> list = getUser.getLoan();
        if ( list != null ) {
            userEntity.loan( new ArrayList<Loan>( list ) );
        }
        userEntity.password( getUser.getPassword() );
        List<Reservation> list1 = getUser.getReservation();
        if ( list1 != null ) {
            userEntity.reservation( new ArrayList<Reservation>( list1 ) );
        }
        userEntity.role( getUser.getRole() );
        userEntity.username( getUser.getUsername() );

        return userEntity.build();
    }

    @Override
    public List<GetUser> toGetUserList(List<UserEntity> userList) {
        if ( userList == null ) {
            return null;
        }

        List<GetUser> list = new ArrayList<GetUser>( userList.size() );
        for ( UserEntity userEntity : userList ) {
            list.add( toGetUser( userEntity ) );
        }

        return list;
    }

    @Override
    public List<UserEntity> toEntityList(List<GetUser> getUserList) {
        if ( getUserList == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( getUserList.size() );
        for ( GetUser getUser : getUserList ) {
            list.add( toEntity( getUser ) );
        }

        return list;
    }
}
