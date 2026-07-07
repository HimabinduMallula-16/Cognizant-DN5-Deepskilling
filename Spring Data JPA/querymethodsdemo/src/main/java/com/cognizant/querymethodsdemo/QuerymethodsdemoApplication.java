package com.cognizant.querymethodsdemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.querymethodsdemo.model.Country;
import com.cognizant.querymethodsdemo.service.CountryService;

@SpringBootApplication
public class QueryMethodsDemoApplication {

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(QueryMethodsDemoApplication.class, args);

        countryService = context.getBean(CountryService.class);
		stockService=context.getBean(StockService.class);

        // Uncomment ONE test at a time

        testSearchCountry();

        // testSearchCountrySorted();

        // testSearchCountryStartsWith();

		// testFacebookStocks();

		//testGoogleStocks();

		//testHighestVolume();

		//testLowestNetflix();
    }

    // ===========================
    // Hands-on 1 - Query Method 1
    // ===========================
    private static void testSearchCountry() {

        System.out.println("\nCountries containing 'ou'\n");

        List<Country> countries =
                countryService.searchCountry("ou");

        countries.forEach(System.out::println);
    }

    // ===========================
    // Hands-on 1 - Query Method 2
    // ===========================
    private static void testSearchCountrySorted() {

        System.out.println("\nCountries containing 'ou' (Ascending)\n");

        List<Country> countries =
                countryService.searchCountrySorted("ou");

        countries.forEach(System.out::println);
    }

    // ===========================
    // Hands-on 1 - Query Method 3
    // ===========================
    private static void testSearchCountryStartsWith() {

        System.out.println("\nCountries starting with 'Z'\n");

        List<Country> countries =
                countryService.searchCountryStartsWith("Z");

        countries.forEach(System.out::println);
    }
	private static StockService stockService;
	private static void testFacebookStocks(){

    stockService
            .getFacebookStocks()
            .forEach(System.out::println);

}
private static void testGoogleStocks(){

    stockService
            .getGoogleStocks()
            .forEach(System.out::println);

}
private static void testHighestVolume(){

    stockService
            .getTopVolume()
            .forEach(System.out::println);

}
private static void testLowestNetflix(){

    stockService
            .getLowestNetflixStocks()
            .forEach(System.out::println);

}

}