package com.riwi.workShop.domain.entities;

import java.sql.Date;
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

@Entity(name = "loan")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Loan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date loanDate;

    private LocalDateTime returnDate;

    @Column(nullable = false, length = 20)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id"
    )
    private UserEntity loanUserEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "book_id", 
        referencedColumnName = "id"
    )
    private Book loanBook;
}
