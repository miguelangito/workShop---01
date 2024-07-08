package com.riwi.workShop.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;
import com.riwi.workShop.config.mapper.BookMapper;
import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.repositories.BookRepository;
import com.riwi.workShop.infrastructure.abstract_service.IBookService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService implements IBookService{

    @Autowired
    private final BookMapper bookMapper;

    @Autowired
    private final BookRepository repository;

    @Override
    public BookResponse create(BookRequest request) {
        Book book = this.bookMapper.bookRequestToEntity(request);
        return this.bookMapper.bookToBookResponse(this.repository.save(book));
    }

    @Override
    public BookResponse get(Long id) {
        return this.bookMapper.bookToBookResponse(this.find(id));
    }

    @Override
    public BookResponse update(BookRequest request, Long id) {
        Book toUpdate = this.bookMapper.bookRequestToEntity(request);

        toUpdate.setId(id);

        return this.bookMapper.bookToBookResponse(this.repository.save(toUpdate));
    }

    @Override
    public void delete(Long id) {
        Book book = this.find(id);
        this.repository.delete(book);
    }

    @Override
    public Page<BookResponse> getAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return this.repository.findAll(pageable).map(book -> this.bookMapper.bookToBookResponse(book));
    }
    
    private Book find(Long id){
        return this.repository.findById(id).orElseThrow();
    }
}
