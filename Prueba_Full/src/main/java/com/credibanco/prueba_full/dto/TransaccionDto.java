package com.credibanco.prueba_full.dto;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TransaccionDto implements Serializable {

    private Integer idTransaccion;
    private String estado;
    private Integer saldo;
    private Integer idTarjeta;
    private Integer idUsuario;
    private List<ProductoDto> productos;
    private Date fecha;

    public TransaccionDto() {
    }

    public TransaccionDto(Integer idTarjeta, Integer saldo, String estado, Integer idTransaccion, Integer idUsuario, List<ProductoDto> productos, Date fecha) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
        this.estado = estado;
        this.idTransaccion = idTransaccion;
        this.idUsuario = idUsuario;
        this.productos = productos;
        this.fecha = fecha;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<ProductoDto> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoDto> productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
