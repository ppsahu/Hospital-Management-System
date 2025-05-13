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

import com.example.HMS.models.Bill;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {
    @GetMapping
    public List<Bill> getAllBill(){
        System.out.println("Fetching all bills..");
        return null;
    }
    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating bill..");
        return bill;
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fetching id by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id){

    }
}
