package com.cognizant.querymethodsdemo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.querymethodsdemo.model.Stock;
import com.cognizant.querymethodsdemo.repository.StockRepository;

import jakarta.transaction.Transactional;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    @Transactional
    public List<Stock> getFacebookStocks(){

        return repository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019,9,1),
                LocalDate.of(2019,9,30));

    }

    @Transactional
    public List<Stock> getGoogleStocks(){

        return repository.findByCodeAndCloseGreaterThan(
                "GOOGL",
                1250);

    }

    @Transactional
    public List<Stock> getTopVolume(){

        return repository.findTop3ByOrderByVolumeDesc();

    }

    @Transactional
    public List<Stock> getLowestNetflixStocks(){

        return repository.findTop3ByCodeOrderByCloseAsc("NFLX");

    }

}