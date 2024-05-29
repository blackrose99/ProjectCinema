package com.proyecto.cine.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class PeliculaServiceImpl implements PeliculaService {

    private List<Pelicula> listaPeliculas = new ArrayList<>();
    private Long idCounter = 1L;

    @Override
    public List<Pelicula> getAllPeliculas() {
        return listaPeliculas;
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
    	pelicula.setId(idCounter++);
        listaPeliculas.add(pelicula);
    }

    @Override
    public void eliminarPelicula(Long id) {
        listaPeliculas.removeIf(pelicula -> pelicula.getId().equals(id));
    }

    @Override
    public Optional<Pelicula> getPeliculaById(Long id) {
        return listaPeliculas.stream().filter(pelicula -> pelicula.getId().equals(id)).findFirst();
    }
}