package com.in.BankingApp.model.dto;


import java.time.LocalDateTime;

public class TransactionDTO {
    private Long transactionId;
    private String transactionType; // Deposit, Withdrawal, Transfer
    private Double amount;
    private LocalDateTime timestamp;
    private AccountDTO account;

    // Constructors
    public TransactionDTO() {}

    public TransactionDTO(Long transactionId, String transactionType, Double amount, LocalDateTime timestamp, AccountDTO account) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = timestamp;
        this.account = account;
    }

    // Getters and Setters
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }
}

