package com.upc.domain.aggregates;

public class Product {
    private Long id;
    private String nombre;
    private String origen;

    // Constructor
    public Product(Long id, String nombre, String origen) {
        this.id = id;
        this.nombre = nombre;
        this.origen = origen;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}