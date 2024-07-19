package com.example.exposedentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    private UUID id;

    private String loginName;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;

    public User() {}

    public UUID getId() {
        return id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
