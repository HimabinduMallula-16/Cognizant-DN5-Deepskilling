package com.cognizant.querymethodsdemo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.querymethodsdemo.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer>{

    // Facebook September Stocks
    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate start,
            LocalDate end);

    // Google close > 1250
    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            double close);

    // Highest Volume
    List<Stock> findTop3ByOrderByVolumeDesc();

    // Lowest Netflix Closing Price
    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);

}