package com.credibanco.prueba_full.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarjetaController {

    // Endpoint simple
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

}
