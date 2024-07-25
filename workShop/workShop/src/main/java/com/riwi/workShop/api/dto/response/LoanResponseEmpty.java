package com.riwi.workShop.api.dto.response;

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
public class LoanResponseEmpty {
   
    private Long id;
    private Date loanDate;
    private LocalDateTime returnDate;
    private String status;
}
