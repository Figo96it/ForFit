package com.app.forfit.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String lastname;

    private String weight;

    private String height;

    private Profession profession;

    public Trainer(Long id, String name, String surname, String lastname, String weight, String height, Profession profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.weight = weight;
        this.height = height;
        this.profession = profession;
    }

    public Trainer(){}
}
