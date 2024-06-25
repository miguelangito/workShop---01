package com.riwi.workShop.infrastructure.abstract_service;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.ReservationResponse;

public interface IReservationService extends CrudService<ReservationRequest,ReservationResponse,Long>{
    
}
