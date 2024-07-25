package com.riwi.workShop.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.ReservationResponse;
import com.riwi.workShop.config.mapper.ReservationMapper;
import com.riwi.workShop.domain.entities.Book;
import com.riwi.workShop.domain.entities.Reservation;
import com.riwi.workShop.domain.entities.UserEntity;
import com.riwi.workShop.domain.repositories.BookRepository;
import com.riwi.workShop.domain.repositories.ReservationRepository;
import com.riwi.workShop.domain.repositories.UserRepository;
import com.riwi.workShop.infrastructure.abstract_service.IReservationService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    @Autowired
    private final ReservationMapper mapper;

    @Autowired
    private final BookRepository bookRepository;

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final ReservationRepository repository;

    @Override
    public ReservationResponse create(ReservationRequest request) {
        Book book = this.bookRepository.findById(request.getBookId()).orElseThrow(() -> new RuntimeException("Book not found"));
        
        UserEntity user = this.userRepository.findById(request.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));
        
        Reservation reservation = this.mapper.reservationRequestToEntity(request);
        
        reservation.setReservationBook(book);
        reservation.setReservationUserEntity(user);

        return this.mapper.reservationToReservationResponse(this.repository.save(reservation));
    }

    @Override
    public ReservationResponse get(Long id) {
        return this.mapper.reservationToReservationResponse(this.find(id));
    }

    @Override
    public ReservationResponse update(ReservationRequest request, Long id) {
        Reservation toUpdate = this.mapper.reservationRequestToEntity(request);
        toUpdate.setId(id);
        return this.mapper.reservationToReservationResponse(this.repository.save(toUpdate));
    }

    @Override
    public void delete(Long id) {
        Reservation reservation = this.find(id);
        this.repository.delete(reservation);
    }

    @Override
    public Page<ReservationResponse> getAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return this.repository.findAll(pageable).map(reservation -> this.mapper.reservationToReservationResponse(reservation));
    }
    
    private Reservation find(Long id){
        return this.repository.findById(id).orElseThrow();
    }
}
