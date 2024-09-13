package com.in.BankingApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.in.BankingApp.model.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Add custom query methods if needed
}

