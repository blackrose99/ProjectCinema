package com.proyecto.cine.entity;

import java.util.Set;

public interface AsientosService {
    Set<String> getAsientosReservados();
    void marcarAsientosComoOcupados(Set<String> asientos);
}
