package com.example.HastaTakipSistemi.service;

import com.example.HastaTakipSistemi.repository.DoctorRepository;
import com.example.HastaTakipSistemi.model.Doctor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DoctorServiceTest {

    @Mock
    private DoctorRepository doctorRepository;

    @InjectMocks
    private DoctorService doctorService;

    @Test
    void testGetDoctorById() {
        Doctor doctor = new Doctor();
        doctor.setId(1L);
        doctor.setName("Dr. Smith");
        doctor.setSpecialization("Cardiology");

        when(doctorRepository.findById(1L)).thenReturn(Optional.of(doctor));

        Doctor foundDoctor = doctorService.getDoctorById(1L);

        assertEquals("Dr. Smith", foundDoctor.getName());
    }
}
