package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.get_mapping.GetLoan;
import com.riwi.workShop.domain.entities.Loan;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {
    
    GetLoan toGetLoan(Loan loan);

    @InheritInverseConfiguration
    Loan toEntity(GetLoan getLoan);

    List<GetLoan> toGetLoanList(List<Loan> loanList);

    List<Loan> toEntityList(List<GetLoan> getLoanList);
}
