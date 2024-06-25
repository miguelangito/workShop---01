package com.riwi.workShop.api.dto.request;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRequest{
    
    private Date loanDate;
    private LocalDateTime returnDate;
    private String status;
    private Long userId;
    private Long bookId; 
}
