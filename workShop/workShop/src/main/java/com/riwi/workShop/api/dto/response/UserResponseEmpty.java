package com.riwi.workShop.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseEmpty {
    
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String role;

}
