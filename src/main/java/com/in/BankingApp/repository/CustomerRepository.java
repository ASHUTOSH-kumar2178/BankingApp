package com.in.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.in.BankingApp.model.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Add custom query methods if needed
}
