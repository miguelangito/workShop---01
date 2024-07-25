package com.riwi.workShop.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.workShop.api.dto.request.ReservationRequest;
import com.riwi.workShop.api.dto.response.ReservationResponse;
import com.riwi.workShop.infrastructure.abstract_service.IReservationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/reservation")
@AllArgsConstructor
public class ReservationController {
    private final IReservationService service;
    
    @GetMapping
    private ResponseEntity<Page<ReservationResponse>>getAll(
        @RequestParam(defaultValue = "1")int page,
        @RequestParam(defaultValue = "5")int size
    ){  return ResponseEntity.ok(this.service.getAll(page -1, size));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ReservationResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.get(id));
    }
    

     @PostMapping
    private ResponseEntity<ReservationResponse>create(
        @RequestBody ReservationRequest request
    ){  return ResponseEntity.ok(this.service.create(request));
    } 

        @PutMapping(path = "/{id}")
    public ResponseEntity<ReservationResponse> update(
        @PathVariable Long id, 
        @RequestBody ReservationRequest entity
        ) {
        return ResponseEntity.ok(this.service.update(entity, id));
    }

    @DeleteMapping(path = "/{id}")
    private ResponseEntity<ReservationResponse>delete(
        @PathVariable Long id
    ){  service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
