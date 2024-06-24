package com.riwi.workShop.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.workShop.domain.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{
    
}
