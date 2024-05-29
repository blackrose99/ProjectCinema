package com.proyecto.cine.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;

import java.util.Set;

@Document(collection = "usuario")
public class Usuario {

    @Id
    private String id;

    @NotEmpty
    private String user;

    @NotEmpty
    private String password;

    private Set<String> asientosReservados;

    private Set<String> asientosOcupados;

    private boolean isAdmin; // Nuevo atributo para marcar si el usuario es administrador

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(Set<String> asientosReservados) {
        this.asientosReservados = asientosReservados;
    }

    public Set<String> getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(Set<String> asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
