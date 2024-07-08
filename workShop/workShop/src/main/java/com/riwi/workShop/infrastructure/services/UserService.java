package com.riwi.workShop.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.workShop.api.dto.request.UserRequest;
import com.riwi.workShop.api.dto.response.UserResponse;
import com.riwi.workShop.config.mapper.UserMapper;
import com.riwi.workShop.domain.entities.UserEntity;
import com.riwi.workShop.domain.repositories.UserRepository;
import com.riwi.workShop.infrastructure.abstract_service.IUserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    @Autowired
    private final UserMapper mapper;

    @Autowired
    private final UserRepository repository;

    @Override
    public UserResponse create(UserRequest request) {
        UserEntity user = this.mapper.UserRequestToEntity(request);
        return this.mapper.userToUserResponse(this.repository.save(user));
    }

    @Override
    public UserResponse get(Long id) {
        return this.mapper.userToUserResponse(this.find(id));
    }

    @Override
    public UserResponse update(UserRequest request, Long id) {
        UserEntity toUpdate = this.mapper.UserRequestToEntity(request);
        toUpdate.setId(id);
        return this.mapper.userToUserResponse(this.repository.save(toUpdate));
    }

    @Override
    public void delete(Long id) {
        UserEntity user =  this.find(id);
        this.repository.delete(user);
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return this.repository.findAll(pageable).map(user -> this.mapper.userToUserResponse(user));
    }
    
    private final UserEntity find(Long id){
        return this.repository.findById(id).orElseThrow();
    }
}
