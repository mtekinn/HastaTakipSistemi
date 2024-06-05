package com.example.HastaTakipSistemi.repository;

import com.example.HastaTakipSistemi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}