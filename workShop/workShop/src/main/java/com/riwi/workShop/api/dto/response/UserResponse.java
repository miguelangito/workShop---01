package com.riwi.workShop.api.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String role;
    private List<LoanResponseEmpty> loan;
    private List<ReservationResponseEmpty> reservation;

}
