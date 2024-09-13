package com.in.BankingApp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    private String loanType; // Home, Auto, Personal
    private Double loanAmount;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
