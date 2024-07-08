package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.LoanRequest;
import com.riwi.workShop.api.dto.response.LoanResponse;
import com.riwi.workShop.domain.entities.Loan;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-08T12:23:42-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public LoanResponse loanToLoanResponse(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanResponse.LoanResponseBuilder loanResponse = LoanResponse.builder();

        loanResponse.id( loan.getId() );
        loanResponse.loanDate( loan.getLoanDate() );
        loanResponse.returnDate( loan.getReturnDate() );
        loanResponse.status( loan.getStatus() );

        return loanResponse.build();
    }

    @Override
    public Loan loanRequestToEntity(LoanRequest loanRequest) {
        if ( loanRequest == null ) {
            return null;
        }

        Loan.LoanBuilder loan = Loan.builder();

        loan.loanDate( loanRequest.getLoanDate() );
        loan.returnDate( loanRequest.getReturnDate() );
        loan.status( loanRequest.getStatus() );

        return loan.build();
    }

    @Override
    public List<LoanResponse> toGetLoanList(List<Loan> loanList) {
        if ( loanList == null ) {
            return null;
        }

        List<LoanResponse> list = new ArrayList<LoanResponse>( loanList.size() );
        for ( Loan loan : loanList ) {
            list.add( loanToLoanResponse( loan ) );
        }

        return list;
    }

    @Override
    public List<Loan> toEntityList(List<LoanResponse> getLoanList) {
        if ( getLoanList == null ) {
            return null;
        }

        List<Loan> list = new ArrayList<Loan>( getLoanList.size() );
        for ( LoanResponse loanResponse : getLoanList ) {
            list.add( loanResponseToLoan( loanResponse ) );
        }

        return list;
    }

    protected Loan loanResponseToLoan(LoanResponse loanResponse) {
        if ( loanResponse == null ) {
            return null;
        }

        Loan.LoanBuilder loan = Loan.builder();

        loan.id( loanResponse.getId() );
        loan.loanDate( loanResponse.getLoanDate() );
        loan.returnDate( loanResponse.getReturnDate() );
        loan.status( loanResponse.getStatus() );

        return loan.build();
    }
}
