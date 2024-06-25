package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.ReservationResponse;
import com.riwi.workShop.domain.entities.Reservation;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {
    
    ReservationResponse reservationToReservationResponse(Reservation reservation);

    Reservation reservationRequestToEntity(ReservationRequest reservationRequest);

    List<ReservationResponse> toGetReservationList(List<Reservation> reservationList);

    List<Reservation> toEntityList(List<ReservationResponse> getReservationList);
}
