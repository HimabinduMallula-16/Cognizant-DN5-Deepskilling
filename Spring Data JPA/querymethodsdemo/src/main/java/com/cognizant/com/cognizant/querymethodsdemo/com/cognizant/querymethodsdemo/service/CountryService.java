package com.cognizant.querymethodsdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.querymethodsdemo.model.Country;
import com.cognizant.querymethodsdemo.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    @Transactional
    public List<Country> searchCountry(String text) {
        return repository.findByNameContaining(text);
    }

    @Transactional
    public List<Country> searchCountrySorted(String text) {
        return repository.findByNameContainingOrderByNameAsc(text);
    }

    @Transactional
    public List<Country> searchCountryStartsWith(String alphabet) {
        return repository.findByNameStartingWith(alphabet);
    }

}