package com.credibanco.prueba_full.controller;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.dto.TransaccionDto;
import com.credibanco.prueba_full.service.Impl.TransaccionesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transacciones")
public class TransaccionController {

    @Autowired
    private TransaccionesServiceImpl transaccionesService;

    @PostMapping("")
    public ResponseEntity<?> crearTransaccion(@RequestBody TransaccionDto transaccion) {
        return ResponseEntity.ok(transaccionesService.crearTransaccion(transaccion));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> consultarTransaccionId(@PathVariable Integer id) {
        return ResponseEntity.ok(transaccionesService.consultarTransaccionId(id));
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<?> consultarTransaccion(@PathVariable Integer id) {
        return ResponseEntity.ok(transaccionesService.consultarTransaccion(id));
    }

    @GetMapping("anular/{id}")
    public ResponseEntity<?> anularTransaccionId(@PathVariable Integer id) {
        return ResponseEntity.ok(transaccionesService.anularTransaccionId(id));
    }

}
