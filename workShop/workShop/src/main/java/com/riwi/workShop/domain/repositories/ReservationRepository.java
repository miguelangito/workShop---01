package com.riwi.workShop.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.workShop.domain.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{
    
}
