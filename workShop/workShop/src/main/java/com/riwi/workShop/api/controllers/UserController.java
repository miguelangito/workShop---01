package com.riwi.workShop.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.workShop.api.dto.request.UserRequest;
import com.riwi.workShop.api.dto.response.UserResponse;
import com.riwi.workShop.infrastructure.abstract_service.IUserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {
    private final IUserService service;
    
    @GetMapping
    private ResponseEntity<Page<UserResponse>>getAll(
        @RequestParam(defaultValue = "1")int page,
        @RequestParam(defaultValue = "5")int size
    ){  return ResponseEntity.ok(this.service.getAll(page -1, size));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.get(id));
    }
    

     @PostMapping
    private ResponseEntity<UserResponse>create(
        @RequestBody UserRequest request
    ){  return ResponseEntity.ok(this.service.create(request));
    } 

        @PutMapping(path = "/{id}")
    public ResponseEntity<UserResponse> update(
        @PathVariable Long id, 
        @RequestBody UserRequest entity
        ) {
        return ResponseEntity.ok(this.service.update(entity, id));
    }

    @DeleteMapping(path = "/{id}")
    private ResponseEntity<UserResponse>delete(
        @PathVariable Long id
    ){  service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
