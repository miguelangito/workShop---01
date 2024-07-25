package com.riwi.workShop.config.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.LoanRequest;
import com.riwi.workShop.api.dto.response.LoanResponse;
import com.riwi.workShop.domain.entities.Loan;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {
    
    @Mapping(target = "loanUserEntity.id", source = "userId")
    @Mapping(target = "loanBook.id", source = "bookId")
    @Mapping(target = "id", ignore = true)
    Loan loanRequestToEntity(LoanRequest loanRequest);
    
    @Mapping(target = "user.id", source = "loanUserEntity.id")
    @Mapping(target = "book.id", source = "loanBook.id")
    LoanResponse loanToLoanResponse(Loan loan);

    // List<LoanResponse> toGetLoanList(List<Loan> loanList);

    // List<Loan> toEntityList(List<LoanResponse> getLoanList);
}
