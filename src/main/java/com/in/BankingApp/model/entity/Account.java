package com.in.BankingApp.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.transaction.Transaction;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String accountNumber;
    private String accountType; // Savings, Checking
    private Double balance;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;
}


