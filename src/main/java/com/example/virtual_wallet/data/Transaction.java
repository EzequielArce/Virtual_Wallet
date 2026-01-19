package com.example.virtual_wallet.data;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    private @Id @GeneratedValue long id;
    private long amount;
    private String type; // DEPOSIT, PAYMENT, TRANSACTION
    private String description;
    private LocalDateTime timeStamp;
    private Account origin;
    private Account destiny;

    public Transaction(long amount, String type, String description, Account origin, Account destiny){
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.timeStamp = LocalDateTime.now();
        this.origin = origin;
        this.destiny = destiny;
    }
    
    //Getters y setters
    public Account getOrigin() {
        return origin;
    }

    public Account getDestiny() {
        return destiny;
    }

    public long getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    
}
