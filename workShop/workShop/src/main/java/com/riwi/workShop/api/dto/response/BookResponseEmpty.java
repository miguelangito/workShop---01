package com.riwi.workShop.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseEmpty {

    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private String isbn;

}
