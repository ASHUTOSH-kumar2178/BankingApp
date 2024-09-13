package com.in.BankingApp.model.dto;

import java.util.List;

public class CustomerDTO {
        private Long customerId;
        private String name;
        private String email;
        private String phone;
        private BranchDTO branch;
        private List<AccountDTO> accounts;
    
        // Constructors
        public CustomerDTO() {}
    
        public CustomerDTO(Long customerId, String name, String email, String phone, BranchDTO branch, List<AccountDTO> accounts) {
            this.customerId = customerId;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.branch = branch;
            this.accounts = accounts;
        }
    
        // Getters and Setters
        public Long getCustomerId() {
            return customerId;
        }
    
        public void setCustomerId(Long customerId) {
            this.customerId = customerId;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public void setPhone(String phone) {
            this.phone = phone;
        }
    
        public BranchDTO getBranch() {
            return branch;
        }
    
        public void setBranch(BranchDTO branch) {
            this.branch = branch;
        }
    
        public List<AccountDTO> getAccounts() {
            return accounts;
        }
    
        public void setAccounts(List<AccountDTO> accounts) {
            this.accounts = accounts;
        }
    }
    

