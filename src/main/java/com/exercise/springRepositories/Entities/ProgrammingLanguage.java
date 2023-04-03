package com.exercise.springRepositories.Entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class ProgrammingLanguage {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column
    private LocalDate firstAppearance;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int id, String name, LocalDate firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(LocalDate firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
