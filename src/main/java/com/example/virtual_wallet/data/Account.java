package com.example.virtual_wallet.data;

import java.time.LocalDateTime;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Account {
    private @Id @GeneratedValue long id;
    private long cbu;
    private String currency;
    private long balance;
    private final LocalDateTime creationDate;
    private LocalDateTime updatedDate;
    @ManyToOne
    @JoinColumn(name = "user_id") // Esta columna se creará en la tabla Account
    private User user;

    public Account (String currency, User user){
        this.creationDate = LocalDateTime.now();
        balance = 0;
        this.updatedDate = LocalDateTime.now();
        this.currency = currency;
        this.user = user;
        
        Random random = new Random();
        this.cbu = random.nextLong();
    }

    public long getId() {
        return id;
    }

    public long getCbu() {
        return cbu;
    }

    public String getCurrency() {
        return currency;
    }

    public long getBalance() {
        return balance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    
}
