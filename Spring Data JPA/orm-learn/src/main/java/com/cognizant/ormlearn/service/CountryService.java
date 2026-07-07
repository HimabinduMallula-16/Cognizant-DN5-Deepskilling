package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // ==========================
    // Hands-on 1
    // Get All Countries
    // ==========================

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // ==========================
    // Hands-on 6
    // Find Country By Code
    // ==========================

    @Transactional
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // ==========================
    // Hands-on 7
    // Add Country
    // ==========================

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // ==========================
    // Hands-on 8
    // Update Country
    // ==========================

    @Transactional
    public void updateCountry(Country country) {
        countryRepository.save(country);
    }

    // ==========================
    // Hands-on 9
    // Delete Country
    // ==========================

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }
}