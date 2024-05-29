package com.proyecto.cine.entity;

public class Comida {

	private Long id;
    private String nombre;
    private double precio;

    public Comida() {
    }

    public Comida(String nombre, double precio) {
    	
    	this.nombre = nombre;
        this.precio = precio;
    }
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}