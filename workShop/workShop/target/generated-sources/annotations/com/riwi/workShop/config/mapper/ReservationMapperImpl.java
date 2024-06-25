package com.riwi.workShop.config.mapper;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.ReservationResponse;
import com.riwi.workShop.domain.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-25T11:12:13-0500",
    comments = "version: 1.6.0.Beta2, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationResponse reservationToReservationResponse(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResponse.ReservationResponseBuilder reservationResponse = ReservationResponse.builder();

        reservationResponse.reservationDate( reservation.getReservationDate() );
        reservationResponse.status( reservation.isStatus() );

        return reservationResponse.build();
    }

    @Override
    public Reservation reservationRequestToEntity(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.reservationDate( reservationRequest.getReservationDate() );
        reservation.status( reservationRequest.isStatus() );

        return reservation.build();
    }

    @Override
    public List<ReservationResponse> toGetReservationList(List<Reservation> reservationList) {
        if ( reservationList == null ) {
            return null;
        }

        List<ReservationResponse> list = new ArrayList<ReservationResponse>( reservationList.size() );
        for ( Reservation reservation : reservationList ) {
            list.add( reservationToReservationResponse( reservation ) );
        }

        return list;
    }

    @Override
    public List<Reservation> toEntityList(List<ReservationResponse> getReservationList) {
        if ( getReservationList == null ) {
            return null;
        }

        List<Reservation> list = new ArrayList<Reservation>( getReservationList.size() );
        for ( ReservationResponse reservationResponse : getReservationList ) {
            list.add( reservationResponseToReservation( reservationResponse ) );
        }

        return list;
    }

    protected Reservation reservationResponseToReservation(ReservationResponse reservationResponse) {
        if ( reservationResponse == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.reservationDate( reservationResponse.getReservationDate() );
        reservation.status( reservationResponse.isStatus() );

        return reservation.build();
    }
}
