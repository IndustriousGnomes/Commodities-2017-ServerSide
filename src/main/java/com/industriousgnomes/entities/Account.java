package com.industriousgnomes.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Account {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    // Amount of current capital in cents.
    private long capital;

    public Double getCapitalAsDollars() {
        return capital / 100.00;
    }
}
