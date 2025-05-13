package com.example.HMS.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HMS.models.Appointment;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    @GetMapping
    public List<Appointment> getAllAppointment(){
        System.out.println("Fetching all appointments..");
        return null;
    }
    @PostMapping
    public Appointment createPatient(@RequestBody Appointment appointment){
        System.out.println("Creating patient..");
        return appointment;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        System.out.println("Fetching id by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){

    }
}
