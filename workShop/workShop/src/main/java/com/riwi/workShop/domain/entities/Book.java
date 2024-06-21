package com.riwi.workShop.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String author;

    @Column(nullable = false)
    private int publicationYear;

    @Column(nullable = false, length = 50)
    private String genre;

    @Column(nullable = false, length = 20)
    private String isbn;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        mappedBy = "loanBook",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Loan> loan;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        mappedBy = "reservationBook",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Reservation> reservation;
}
