package com.riwi.workShop.config.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.ReservationResponse;
import com.riwi.workShop.domain.entities.Reservation;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {
    
    @Mapping(target = "reservationUserEntity.id", source = "userId") 
    @Mapping(target = "reservationBook.id", source = "bookId") 
    @Mapping(target = "id", ignore = true)
    Reservation reservationRequestToEntity(ReservationRequest reservationRequest);
    
    @Mapping(target = "user.id", source = "reservationUserEntity.id") 
    @Mapping(target = "book.id", source = "reservationBook.id") 
    ReservationResponse reservationToReservationResponse(Reservation reservation);
}
