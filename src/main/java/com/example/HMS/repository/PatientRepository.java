package com.example.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HMS.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
