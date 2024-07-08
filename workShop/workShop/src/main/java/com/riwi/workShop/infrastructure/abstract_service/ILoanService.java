package com.riwi.workShop.infrastructure.abstract_service;

import com.riwi.workShop.api.dto.request.LoanRequest;
import com.riwi.workShop.api.dto.response.LoanResponse;

public interface ILoanService extends CrudService<LoanRequest,LoanResponse,Long>{
    
}
