package com.example.exposedentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {
    @Id
    private UUID id;

    @ManyToOne
    @JsonIgnore //!!
    private User user;

    private BigDecimal amount;

//    private String description;//!!

    public Transaction() {
    }

    public UUID getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}

