package com.credibanco.prueba_full.service;

import com.credibanco.prueba_full.dto.ProductoDto;

import java.util.List;

public interface IProductosService {

    public List<ProductoDto> obtenerProductos();
    public List<ProductoDto> buscarProductos(String titulo);
    public ProductoDto buscarProductosId(Integer id);
}
