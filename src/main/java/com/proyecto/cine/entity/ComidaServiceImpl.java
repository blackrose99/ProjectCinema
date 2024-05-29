package com.proyecto.cine.entity;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;



@Service
public class ComidaServiceImpl implements ComidaService {

    private List<Comida> listaComidas = new ArrayList<>();
    private Long idCounter = 1L;

    @Override
    public List<Comida> getAllComidas() {
        return listaComidas;
    }

    @Override
    public void agregarComida(Comida comida) {
        comida.setId(idCounter++);
        listaComidas.add(comida);
    }

    @Override
    public void eliminarComida(Long id) {
        listaComidas.removeIf(comida -> comida.getId().equals(id));
    }

    @Override
    public Optional<Comida> getComidaById(Long id) {
        return listaComidas.stream().filter(comida -> comida.getId().equals(id)).findFirst();
    }
}