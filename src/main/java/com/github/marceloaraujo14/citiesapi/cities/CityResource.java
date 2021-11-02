package com.github.marceloaraujo14.citiesapi.cities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }


    // 2nd - Pageable
    @GetMapping
    public ResponseEntity cities(final Pageable page)
    {
        return ResponseEntity.ok().body(repository.findAll(page));
    }
}