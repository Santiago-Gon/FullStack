package com.credibanco.prueba_full.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @Column(name="ID")
    private Integer id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Sexo")
    private String sexo;
    @Column(name="Correo")
    private String correo;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String sexo, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
