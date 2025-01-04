package com.credibanco.prueba_full.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

public class TarjetaDto implements Serializable {


    private Integer idTarjeta;
    private String titular;
    private Date fechaVen;
    private String tipoTarjeta;
    private Integer idUsuario;
    private Integer saldo;
    public TarjetaDto() {
    }

    public TarjetaDto(Integer idTarjeta, String titular, Date fechaVen, String tipoTarjeta, Integer idUsuario, Integer saldo) {
        this.idTarjeta = idTarjeta;
        this.titular = titular;
        this.fechaVen = fechaVen;
        this.tipoTarjeta = tipoTarjeta;
        this.idUsuario = idUsuario;
        this.saldo = saldo;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}

