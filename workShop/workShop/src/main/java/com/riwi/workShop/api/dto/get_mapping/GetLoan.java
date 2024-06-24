package com.riwi.workShop.api.dto.get_mapping;

import java.sql.Date;
import java.time.LocalDateTime;

import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetLoan {
    
    private Long id;
    private Date loanDate;
    private LocalDateTime returnDate;
    private String status;
    private UserEntity loanUserEntity;
    private Book loanBook;

}
