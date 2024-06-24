package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.get_mapping.GetReservation;
import com.riwi.workShop.domain.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-24T10:38:29-0500",
    comments = "version: 1.6.0.Beta2, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public GetReservation toGetReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        GetReservation.GetReservationBuilder getReservation = GetReservation.builder();

        getReservation.id( reservation.getId() );
        getReservation.reservationBook( reservation.getReservationBook() );
        getReservation.reservationDate( reservation.getReservationDate() );
        getReservation.reservationUserEntity( reservation.getReservationUserEntity() );
        getReservation.status( reservation.isStatus() );

        return getReservation.build();
    }

    @Override
    public Reservation toEntity(GetReservation getReservation) {
        if ( getReservation == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.id( getReservation.getId() );
        reservation.reservationBook( getReservation.getReservationBook() );
        reservation.reservationDate( getReservation.getReservationDate() );
        reservation.reservationUserEntity( getReservation.getReservationUserEntity() );
        reservation.status( getReservation.isStatus() );

        return reservation.build();
    }

    @Override
    public List<GetReservation> toGetReservationList(List<Reservation> reservationList) {
        if ( reservationList == null ) {
            return null;
        }

        List<GetReservation> list = new ArrayList<GetReservation>( reservationList.size() );
        for ( Reservation reservation : reservationList ) {
            list.add( toGetReservation( reservation ) );
        }

        return list;
    }

    @Override
    public List<Reservation> toEntityList(List<GetReservation> getReservationList) {
        if ( getReservationList == null ) {
            return null;
        }

        List<Reservation> list = new ArrayList<Reservation>( getReservationList.size() );
        for ( GetReservation getReservation : getReservationList ) {
            list.add( toEntity( getReservation ) );
        }

        return list;
    }
}
