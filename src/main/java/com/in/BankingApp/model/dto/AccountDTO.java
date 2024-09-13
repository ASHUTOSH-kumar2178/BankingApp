package com.in.BankingApp.model.dto;
import java.util.List;

public class AccountDTO {
    private Long accountId;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private CustomerDTO customer;
    private List<TransactionDTO> transactions;

    // Constructors
    public AccountDTO() {}

    public AccountDTO(Long accountId, String accountNumber, String accountType, Double balance, CustomerDTO customer, List<TransactionDTO> transactions) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.customer = customer;
        this.transactions = transactions;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<TransactionDTO> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionDTO> transactions) {
        this.transactions = transactions;
    }
}

