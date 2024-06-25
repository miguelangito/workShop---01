package com.riwi.workShop.api.dto.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {
    
    private LocalDateTime reservationDate;
    private boolean status;
    private Long userId;
    private Long bookId;
}
