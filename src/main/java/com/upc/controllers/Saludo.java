package com.upc.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/saludo")
public class Saludo {
    @GetMapping
    public String saludar() {
        return "¡Hola desde Jenkins y Spring Boot, este es un nuevo mensaje!";
    }
}
