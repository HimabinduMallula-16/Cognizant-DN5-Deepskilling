package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ArrayList<Country> getAllCountries() {

        LOGGER.info("Start");
        ArrayList<Country> countries = countryService.getAllCountries();
        LOGGER.info("End");

        return countries;
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {

        LOGGER.info("Start");
        Country country = countryService.getCountry(code);
        LOGGER.info("End");

        return country;
    }

    @PostMapping
    public Country addCountry(@RequestBody @Valid Country country) {

        LOGGER.info("Start");
        LOGGER.debug("Country : {}", country);

        Country result = countryService.addCountry(country);

        LOGGER.info("End");

        return result;
    }

}