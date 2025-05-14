package com.example.HMS.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.HMS.models.Patient;
import com.example.HMS.repository.PatientRepository;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository patientRepository;
    
    public List<Patient> getAllPatients(){
        try{
            System.out.println("into Patient service layer..");
            return patientRepository.findAll();
        }
        catch (Exception e){
            logger.error("An error occured while fetching all patients: {}", e.getMessage(), e);
            return null;
        }
    }

    public Patient createPatient(Patient patient){
        try{
            patientRepository.save(patient);
            return patient;
        }
        catch (Exception e){
            logger.error("An error occured while creating patient: {}", e.getMessage(), e);
            return null;
        }
    }

    public Patient getPatientById(Long id){
        try{
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        }
        catch (Exception e){
            logger.error("An error occured while fetching all patients by ID: {}", e.getMessage(), e);
            return null;
        }
    }

    public void deletePatient(Long id){
        try{
            patientRepository.deleteById(id);
        }
        catch (Exception e){
            logger.error("An error occured while deleting patient: {}", e.getMessage(), e);
        }
    }

    public Patient updatePatient(Long id, Patient updatedPatient){
        try{
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if(existingPatient.isPresent()){
                Patient p = existingPatient.get();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                patientRepository.save(p);
                return updatedPatient;
            }
            else{
                logger.error("Patinet with ID {} not foound", id);
                return null;
            }
        }
        catch (Exception e){
            logger.error("An error occured while updating patient: {}", e.getMessage(), e);
            return null;
        }
    }
}
