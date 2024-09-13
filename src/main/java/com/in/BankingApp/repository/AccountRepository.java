package com.in.BankingApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.in.BankingApp.model.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // Add custom query methods if needed
}

