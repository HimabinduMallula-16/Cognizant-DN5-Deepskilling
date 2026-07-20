package com.cognizant.billingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.billingservice.entity.Bill;
import com.cognizant.billingservice.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingService service;

    @PostMapping
    public Bill save(@RequestBody Bill bill){
        return service.save(bill);
    }

    @GetMapping
    public List<Bill> getAll(){
        return service.getAll();
    }
}