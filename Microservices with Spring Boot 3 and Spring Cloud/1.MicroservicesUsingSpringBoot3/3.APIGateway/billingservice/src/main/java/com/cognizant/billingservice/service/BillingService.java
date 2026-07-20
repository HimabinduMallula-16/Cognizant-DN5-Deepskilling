package com.cognizant.billingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.billingservice.entity.Bill;
import com.cognizant.billingservice.repository.BillRepository;

@Service
public class BillingService {

    @Autowired
    private BillRepository repository;

    public Bill save(Bill bill){
        return repository.save(bill);
    }

    public List<Bill> getAll(){
        return repository.findAll();
    }
}