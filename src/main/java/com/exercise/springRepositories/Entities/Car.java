package com.exercise.springRepositories.Entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String modelType;

    @Column
    private String serialNumber;

    @Column
    private double currentPrice;
}
