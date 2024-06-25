package com.riwi.workShop.infrastructure.abstract_service;

import com.riwi.workShop.api.dto.request.BookRequest;
import com.riwi.workShop.api.dto.response.BookResponse;

public interface ILoanService extends CrudService<BookRequest,BookResponse,Long>{
    
}
