package com.example.virtual_wallet.data;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FixedTermDeposit {
    private @Id @GeneratedValue long id;
    private long amount;
    private LocalDateTime creationDate;
    private LocalDateTime closingDate;
    private float interestRate;
    
    public FixedTermDeposit(long amount, LocalDateTime closingDate, float interestRate) {
        this.amount = amount;
        this.creationDate = LocalDateTime.now();
        this.closingDate = closingDate;
        this.interestRate = interestRate;
    }

    public long getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getClosingDate() {
        return closingDate;
    }

    public float getInterestRate() {
        return interestRate;
    }

}
