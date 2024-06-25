package com.riwi.workShop.infrastructure.services;

import org.springframework.data.domain.Page;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;
import com.riwi.workShop.infrastructure.abstract_service.IBookService;

public class BookService implements IBookService{

    @Override
    public BookResponse create(BookRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public BookResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public BookResponse update(BookRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<BookResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
