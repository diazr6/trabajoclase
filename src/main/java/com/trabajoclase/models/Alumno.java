package com.trabajoclase.models;


import javax.persistence.*;

@Entity
@Table(name="alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nombre", columnDefinition = "varchar(20)")
    private String nombre;
    @Column(name="apaterno", columnDefinition = "varchar(20)")
    private String apaterno;
    @Column(name="amaterno", columnDefinition = "varchar(20)")
    private String amaterno;

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }
}