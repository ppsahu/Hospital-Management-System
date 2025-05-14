package com.example.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HMS.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    
}
