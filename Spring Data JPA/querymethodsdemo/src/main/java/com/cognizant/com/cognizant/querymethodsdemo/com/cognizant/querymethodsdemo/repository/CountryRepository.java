package com.cognizant.querymethodsdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.querymethodsdemo.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Hands-on 1 - Search containing text
    List<Country> findByNameContaining(String text);

    // Hands-on 1 - Search containing text and sort
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Hands-on 1 - Starts with
    List<Country> findByNameStartingWith(String alphabet);

}