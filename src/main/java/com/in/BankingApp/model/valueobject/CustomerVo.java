package com.in.BankingApp.model.valueobject;


public class CustomerVo {
    private String name;
    private String email;
    private String phone;
    private Long branchId; // This might refer to a specific branch

    // Constructors
    public CustomerVo(String name, String email, String phone, Long branchId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.branchId = branchId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Long getBranchId() {
        return branchId;
    }
}

