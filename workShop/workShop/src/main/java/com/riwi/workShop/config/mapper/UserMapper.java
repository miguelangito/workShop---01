package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.get_mapping.GetUser;
import com.riwi.workShop.domain.entities.UserEntity;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {


    GetUser toGetUser(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity toEntity(GetUser getUser);

    List<GetUser> toGetUserList(List<UserEntity> userList);

    List<UserEntity> toEntityList(List<GetUser> getUserList);
}
