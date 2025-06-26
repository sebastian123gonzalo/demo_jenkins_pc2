package com.upc.interfaces.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.upc.domain.aggregates.Product;

import java.util.List;


@RestController
@RequestMapping("/api/v1/productos")
public class ProductController {

    @GetMapping
    public List<Product> obtenerProductosAgricolas() {
        return List.of(
                new Product(1L, "Papa nativa", "Andahuaylas"),
                new Product(2L, "Maíz amarillo duro", "Cajamarca"),
                new Product(3L, "Palta Hass", "Ayacucho"),
                new Product(4L, "Café orgánico", "San Martín")
        );
    }
}