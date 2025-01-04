package com.credibanco.prueba_full.service.Impl;

import com.credibanco.prueba_full.cliente.ProductosCliente;
import com.credibanco.prueba_full.dto.ProductoDto;
import com.credibanco.prueba_full.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements IProductosService {
    @Autowired
    private ProductosCliente productosCliente;

    @Override
    public List<ProductoDto> obtenerProductos() {
        return productosCliente.obtenerProductos();
    }

    @Override
    public List<ProductoDto> buscarProductos(String titulo) {
        return productosCliente.buscarProductos(titulo);
    }

    @Override
    public ProductoDto buscarProductosId(Integer id) {
        return productosCliente.buscarProductosId(id);
    }
}
