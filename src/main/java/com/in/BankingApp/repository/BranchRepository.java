package com.in.BankingApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.in.BankingApp.model.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    // Add custom query methods if needed
}

