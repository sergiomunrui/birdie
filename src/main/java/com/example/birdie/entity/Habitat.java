package com.example.birdie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Habitat {

    // Atributos

    @Id
    @Column(name="id_habitat")
    private Integer id;

    private String nombreHab;

    // Constructores

    public Habitat() {
    }

    public Habitat(Integer id, String nombreHab) {
        this.id = id;
        this.nombreHab = nombreHab;
    }

    public Habitat(String nombreHab) {
        this.nombreHab = nombreHab;
    }

    public Habitat(Integer id) {
        this.id = id;
    }

    // Getter y Setter


    public Integer getId() {
        return id;
    }

    public String getNombreHab() {
        return nombreHab;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombreHab(String nombreHab) {
        this.nombreHab = nombreHab;
    }
}
