package com.credibanco.prueba_full.cliente;

import com.credibanco.prueba_full.dto.ProductoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url="https://api.escuelajs.co/api/v1/products",name = "Producto")
public interface ProductosCliente {

    @GetMapping("")
    public List<ProductoDto> obtenerProductos();
    @GetMapping("/")
    public List<ProductoDto> buscarProductos(@RequestParam("title") String titulo);
    @GetMapping("/{id}")
    public ProductoDto buscarProductosId(@PathVariable("id") Integer id );

}
