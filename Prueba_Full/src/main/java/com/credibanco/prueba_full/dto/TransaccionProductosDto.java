package com.credibanco.prueba_full.dto;

import jakarta.persistence.Column;

import java.io.Serializable;

public class TransaccionProductosDto implements Serializable {

    private Integer idTransaccionProductos;
    private Integer idTransaccion;
    private Integer idProducto;
    private Integer precio;
    private String nombre;

    public TransaccionProductosDto() {
    }

    public TransaccionProductosDto(Integer idTransaccionProductos, Integer idTransaccion, Integer idProducto, Integer precio, String nombre) {
        this.idTransaccionProductos = idTransaccionProductos;
        this.idTransaccion = idTransaccion;
        this.idProducto = idProducto;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Integer getIdTransaccionProductos() {
        return idTransaccionProductos;
    }

    public void setIdTransaccionProductos(Integer idTransaccionProductos) {
        this.idTransaccionProductos = idTransaccionProductos;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
