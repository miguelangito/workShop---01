package com.riwi.workShop.api.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private String isbn;
    private List<LoanResponseEmpty> loan;
    private List<ReservationResponseEmpty> reservation;
}
