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

    public Car() {
    }

    public Car(int id, String modelType, String serialNumber, double currentPrice) {
        this.id = id;
        this.modelType = modelType;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
