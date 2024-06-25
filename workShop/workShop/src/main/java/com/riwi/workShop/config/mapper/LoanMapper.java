package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.LoanRequest;
import com.riwi.workShop.api.dto.response.LoanResponse;
import com.riwi.workShop.domain.entities.Loan;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {
    
    LoanResponse loanToLoanResponse(Loan loan);

    Loan loanRequestToEntity(LoanRequest loanRequest);

    List<LoanResponse> toGetLoanList(List<Loan> loanList);

    List<Loan> toEntityList(List<LoanResponse> getLoanList);
}
