package com.riwi.workShop.api.dto.request;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRequest{
    
    @NotNull(message = "Loan Date is required")
    private Date loanDate;

    @NotNull(message = "Return Date is required")
    private LocalDateTime returnDate;

    @NotBlank(message = "Status is required")
    private String status;

    @NotNull(message = "userId is required")
    private Long userId;

    @NotNull(message = "bookId is required")
    private Long bookId; 
}
