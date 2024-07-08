package com.riwi.workShop.api.dto.response;

import java.time.LocalDateTime;

import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResponse {
    
    private LocalDateTime reservationDate;
    private boolean status;
    private Book book;
    private UserEntity user;
}
