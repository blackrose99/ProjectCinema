package com.proyecto.cine.entity;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    List<Pelicula> getAllPeliculas();

    void agregarPelicula(Pelicula pelicula);


    Optional<Pelicula> getPeliculaById(Long id);

	void eliminarPelicula(Long id);
}
