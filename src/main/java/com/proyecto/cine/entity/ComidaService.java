package com.proyecto.cine.entity;

import java.util.List;
import java.util.Optional;

public interface ComidaService {

    List<Comida> getAllComidas();

    void agregarComida(Comida comida);


    Optional<Comida> getComidaById(Long id);

	void eliminarComida(Long id);
}