package com.riwi.workShop.infrastructure.abstract_service;

import com.riwi.workShop.api.dto.request.UserRequest;
import com.riwi.workShop.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserRequest,UserResponse,Long>{
    
}
