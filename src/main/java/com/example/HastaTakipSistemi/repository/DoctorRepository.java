package com.example.HastaTakipSistemi.repository;

import com.example.HastaTakipSistemi.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

