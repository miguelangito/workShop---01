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

@Entity(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, length = 20)
    private String role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        mappedBy = "loanUserEntity",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Loan> loan;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        mappedBy = "reservationUserEntity",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Reservation> reservation;

}
