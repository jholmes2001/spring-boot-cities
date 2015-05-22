package com.example.cities.repositories;

import com.example.cities.domain.City;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface CityRepository extends PagingAndSortingRepository<City, Long> {

    Page<City> findAll(Pageable pageable);

    City findById(Long id);

    Page<City> findByNameIgnoreCase(@Param("q") String name, Pageable pageable);

    Page<City> findByNameContainsIgnoreCase(@Param("q") String name, Pageable pageable);

    Page<City> findByStateCodeIgnoreCase(@Param("q") String stateCode, Pageable pageable);

    Page<City> findByPostalCode(@Param("q") String postalCode, Pageable pageable);
}
