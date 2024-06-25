package com.riwi.workShop.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest{
    
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String role;
}
