package com.credibanco.prueba_full.controller;

import com.credibanco.prueba_full.service.IProductosService;
import com.credibanco.prueba_full.service.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("productos")
public class ProductosController {

    @Autowired
    private IProductosService productosService;

    // Endpoint simple
    @GetMapping("")
    public ResponseEntity<?> obtenerProductos() {

        return ResponseEntity.ok(productosService.obtenerProductos());
    }

    @GetMapping("/")
    public ResponseEntity<?> buscarProductos(@RequestParam String titulo) {

        return ResponseEntity.ok(productosService.buscarProductos(titulo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProductosId(@PathVariable Integer id) {

        return ResponseEntity.ok(productosService.buscarProductosId(id));
    }


}
