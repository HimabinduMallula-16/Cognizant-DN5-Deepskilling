package com.cognizant.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.billingservice.entity.Bill;

public interface BillRepository extends JpaRepository<Bill,Long>{
}