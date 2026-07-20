package com.cognizant.billingservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name="bills")
public class Bill {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private double amount;

    public Bill(){}

    public Bill(Long id, Long customerId, double amount){
        this.id=id;
        this.customerId=customerId;
        this.amount=amount;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getCustomerId(){ return customerId; }
    public void setCustomerId(Long customerId){ this.customerId=customerId; }

    public double getAmount(){ return amount; }
    public void setAmount(double amount){ this.amount=amount; }
}