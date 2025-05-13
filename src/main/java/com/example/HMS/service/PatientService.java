package com.example.HMS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HMS.models.Patient;

@Service
public class PatientService {
    public List<Patient> getAllPatients(){
        try{
            System.out.println("into Patient service layer..");
            return null;
        }
        catch (Exception e){
            System.out.println("Error Message: "+ e.getMessage());
            return null;
        }
    }

    public Patient createPatient(){
        try{
            System.out.println("into Patient service layer..creating patient");
            return null;
        }
        catch (Exception e){
            System.out.println("Error Message: "+ e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(){
        try{
            return null;
        }
        catch (Exception e){
            System.out.println("Error Message: "+ e.getMessage());
            return null;
        }
    }

    public void deletePatient(){
        try{

        }
        catch (Exception e){
            System.out.println("Error Message: "+ e.getMessage());
        }
    }

    public void updatePatient(){
        try{
            
        }
        catch (Exception e){
            System.out.println("Error Message: "+ e.getMessage());
        }
    }
}
