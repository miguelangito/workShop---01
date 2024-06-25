package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.UserRequest;
import com.riwi.workShop.api.dto.response.UserResponse;
import com.riwi.workShop.domain.entities.UserEntity;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserResponse userToUserResponse(UserEntity userEntity);

    UserEntity UserRequestToEntity(UserRequest getUser);

    List<UserResponse> toGetUserList(List<UserEntity> userList);

    List<UserEntity> toEntityList(List<UserResponse> getUserList);
}
