package com.proyecto.cine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.cine.entity.Pelicula;
import com.proyecto.cine.entity.PeliculaService;



@Controller
@RequestMapping("/api/admin-peliculas")
public class AdminPeliculaResController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/admin-peliculas")
    public String getAdminPelicula(Model model) {
        model.addAttribute("peliculas", peliculaService.getAllPeliculas());
        return "admin-peliculas";
    }

    @PostMapping("/agregar-pelicula")
    public String agregarPelicula(@RequestParam String nombre, Model model) {
        Pelicula nuevaPelicula = new Pelicula(nombre);
        peliculaService.agregarPelicula(nuevaPelicula);
        System.out.println("Película agregada: " + nuevaPelicula.getNombre());
        return getAdminPelicula(model);
    }

    @GetMapping("/eliminar-peliculas/{id}")
    public String eliminarPelicula(@PathVariable Long id) {
        try {
            peliculaService.eliminarPelicula(id);
            return "redirect:/api/admin-peliculas/admin-peliculas";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/api/admin-peliculas"; // Redirige a la página principal en caso de error
        }
    }
}
