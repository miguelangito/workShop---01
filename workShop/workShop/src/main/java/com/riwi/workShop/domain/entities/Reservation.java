package com.riwi.workShop.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime reservationDate;

    @Column(nullable = false)
    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id"
    )
    private UserEntity reservationUserEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "book_id", 
        referencedColumnName = "id"
    )
    private Book reservationBook;
}
