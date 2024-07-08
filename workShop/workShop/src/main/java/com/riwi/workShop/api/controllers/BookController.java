package com.riwi.workShop.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;
import com.riwi.workShop.infrastructure.abstract_service.IBookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/book")
@AllArgsConstructor
public class BookController {
    
    private final IBookService service;
    
    @GetMapping
    private ResponseEntity<Page<BookResponse>>get(
        @RequestParam(defaultValue = "1")int page,
        @RequestParam(defaultValue = "5")int size
    ){  return ResponseEntity.ok(this.service.getAll(page -1, size));
    }

     @PostMapping
    private ResponseEntity<BookResponse>create(
        @RequestBody BookRequest request
    ){
        return ResponseEntity.ok(this.service.create(request));
    } 
}
