package com.credibanco.prueba_full.controller;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.model.Tarjeta;
import com.credibanco.prueba_full.service.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarjetas")
public class TarjetaController {
    @Autowired
    private ITarjetaService tarjetaService;

    // Endpoint simple
    @GetMapping("/{id}")
    public ResponseEntity<?> consultarTarjetasId(@PathVariable Integer id) {
         return ResponseEntity.ok(tarjetaService.consultarTarjetasId(id));
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<?> consultarTarjetas(@PathVariable Integer id) {
        return ResponseEntity.ok(tarjetaService.consultarTarjetas(id));
    }

    @PostMapping("")
    public ResponseEntity<?> crearTarjetas(@RequestBody TarjetaDto tarjeta) {
        return ResponseEntity.ok(tarjetaService.crearTarjetas(tarjeta));
    }

}
