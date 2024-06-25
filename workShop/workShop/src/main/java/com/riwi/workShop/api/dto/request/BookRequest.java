package com.riwi.workShop.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {

    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private String isbn;
}