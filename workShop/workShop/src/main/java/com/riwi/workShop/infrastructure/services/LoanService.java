package com.riwi.workShop.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.workShop.api.dto.request.LoanRequest;
import com.riwi.workShop.api.dto.response.LoanResponse;
import com.riwi.workShop.config.mapper.LoanMapper;
import com.riwi.workShop.domain.entities.Loan;
import com.riwi.workShop.domain.repositories.LoanRepository;
import com.riwi.workShop.infrastructure.abstract_service.ILoanService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoanService implements ILoanService{

    @Autowired
    private final LoanRepository loanRepository;

    @Autowired
    private final LoanMapper loanMapper;


    @Override
    public LoanResponse create(LoanRequest request) {
        Loan loan = this.loanMapper.loanRequestToEntity(request);
        return loanMapper.loanToLoanResponse(this.loanRepository.save(loan));
    }

    @Override
    public LoanResponse get(Long id) {
        return this.loanMapper.loanToLoanResponse(this.find(id));
    }

    @Override
    public LoanResponse update(LoanRequest request, Long id) {
        Loan loan = find(id);
        Loan toUpdate = this.loanMapper.loanRequestToEntity(request);

        toUpdate.setId(id);
        toUpdate.setLoanUserEntity(loan.getLoanUserEntity());

        return this.loanMapper.loanToLoanResponse(this.loanRepository.save(toUpdate));
    }

    @Override
    public void delete(Long id) {
        Loan loan = this.find(id);
        this.loanRepository.delete(loan);
    }

    @Override
    public Page<LoanResponse> getAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return this.loanRepository.findAll(pageable).map(loan -> this.loanMapper.loanToLoanResponse(loan));
    }
    
    private Loan find(Long id){
        return this.loanRepository.findById(id).orElseThrow(); 
    }
}
