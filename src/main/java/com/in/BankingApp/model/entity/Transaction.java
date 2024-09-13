package com.in.BankingApp.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private String transactionType; // Deposit, Withdrawal, Transfer
    private Double amount;
    private LocalDateTime timestamp;
    
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}

