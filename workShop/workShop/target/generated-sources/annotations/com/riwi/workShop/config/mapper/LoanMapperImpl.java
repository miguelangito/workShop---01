package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.get_mapping.GetLoan;
import com.riwi.workShop.domain.entities.Loan;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-24T10:38:28-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public GetLoan toGetLoan(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        GetLoan.GetLoanBuilder getLoan = GetLoan.builder();

        getLoan.id( loan.getId() );
        getLoan.loanBook( loan.getLoanBook() );
        getLoan.loanDate( loan.getLoanDate() );
        getLoan.loanUserEntity( loan.getLoanUserEntity() );
        getLoan.returnDate( loan.getReturnDate() );
        getLoan.status( loan.getStatus() );

        return getLoan.build();
    }

    @Override
    public Loan toEntity(GetLoan getLoan) {
        if ( getLoan == null ) {
            return null;
        }

        Loan.LoanBuilder loan = Loan.builder();

        loan.id( getLoan.getId() );
        loan.loanBook( getLoan.getLoanBook() );
        loan.loanDate( getLoan.getLoanDate() );
        loan.loanUserEntity( getLoan.getLoanUserEntity() );
        loan.returnDate( getLoan.getReturnDate() );
        loan.status( getLoan.getStatus() );

        return loan.build();
    }

    @Override
    public List<GetLoan> toGetLoanList(List<Loan> loanList) {
        if ( loanList == null ) {
            return null;
        }

        List<GetLoan> list = new ArrayList<GetLoan>( loanList.size() );
        for ( Loan loan : loanList ) {
            list.add( toGetLoan( loan ) );
        }

        return list;
    }

    @Override
    public List<Loan> toEntityList(List<GetLoan> getLoanList) {
        if ( getLoanList == null ) {
            return null;
        }

        List<Loan> list = new ArrayList<Loan>( getLoanList.size() );
        for ( GetLoan getLoan : getLoanList ) {
            list.add( toEntity( getLoan ) );
        }

        return list;
    }
}
