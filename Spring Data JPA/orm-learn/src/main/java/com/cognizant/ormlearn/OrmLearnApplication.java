package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        // Uncomment ONE test at a time

        testGetAllCountries();

        //testGetCountry();

        // testAddCountry();

        // testUpdateCountry();

        // testDeleteCountry();
    }

    // ==========================
    // Hands-on 1
    // ==========================

    private static void testGetAllCountries() {

        LOGGER.info("----- Hands-on 1 -----");

        List<Country> countries = countryService.getAllCountries();

        countries.forEach(System.out::println);
    }

    // ==========================
    // Hands-on 6
    // ==========================

    private static void testGetCountry() {

        LOGGER.info("----- Hands-on 6 -----");

        Country country = countryService.getCountry("IN");

        System.out.println(country);
    }

    // ==========================
    // Hands-on 7
    // ==========================

    private static void testAddCountry() {

        LOGGER.info("----- Hands-on 7 -----");

        Country country = new Country("JP", "Japan");

        countryService.addCountry(country);

        System.out.println("Country Added Successfully");
    }

    // ==========================
    // Hands-on 8
    // ==========================

    private static void testUpdateCountry() {

        LOGGER.info("----- Hands-on 8 -----");

        Country country = new Country("JP", "Japan Updated");

        countryService.updateCountry(country);

        System.out.println("Country Updated Successfully");
    }

    // ==========================
    // Hands-on 9
    // ==========================

    private static void testDeleteCountry() {

        LOGGER.info("----- Hands-on 9 -----");

        countryService.deleteCountry("JP");

        System.out.println("Country Deleted Successfully");
    }
}