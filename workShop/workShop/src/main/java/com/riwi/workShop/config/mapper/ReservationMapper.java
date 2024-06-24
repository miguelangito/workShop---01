package com.riwi.workShop.config.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.workShop.api.dto.get_mapping.GetReservation;
import com.riwi.workShop.domain.entities.Reservation;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {
    
    GetReservation toGetReservation(Reservation reservation);

    @InheritInverseConfiguration
    Reservation toEntity(GetReservation getReservation);

    List<GetReservation> toGetReservationList(List<Reservation> reservationList);

    List<Reservation> toEntityList(List<GetReservation> getReservationList);
}
