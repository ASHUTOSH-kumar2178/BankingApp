package com.in.BankingApp.model.dto;


import java.util.List;

public class BranchDTO {
    private Long branchId;
    private String branchName;
    private String location;
    private List<CustomerDTO> customers;

    // Constructors
    public BranchDTO() {}

    public BranchDTO(Long branchId, String branchName, String location, List<CustomerDTO> customers) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.location = location;
        this.customers = customers;
    }

    // Getters and Setters
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}

