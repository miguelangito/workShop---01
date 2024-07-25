package com.riwi.workShop.config.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.UserRequest;
import com.riwi.workShop.api.dto.response.UserResponse;
import com.riwi.workShop.domain.entities.UserEntity;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {


    @Mapping(target = "loan", source = "loan") 
    @Mapping(target = "reservation", source = "reservation")
    @Mapping(target = "loan.user", ignore = true)
    @Mapping(target = "reservation.user", ignore = true)
    UserResponse userToUserResponse(UserEntity userEntity);

    @Mapping(target = "loan", ignore = true)
    @Mapping(target = "reservation", ignore = true)
    @Mapping(target = "id", ignore = true)
    UserEntity UserRequestToEntity(UserRequest getUser);

    // List<UserResponse> toGetUserList(List<UserEntity> userList);

    // List<UserEntity> toEntityList(List<UserResponse> getUserList);
}
