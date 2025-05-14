package com.example.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HMS.models.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    
}
