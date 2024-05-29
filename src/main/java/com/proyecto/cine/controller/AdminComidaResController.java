// AdminComidaResController.java
package com.proyecto.cine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.cine.entity.Comida;
import com.proyecto.cine.entity.ComidaService;


import java.util.Optional;

@Controller
@RequestMapping("/api/admin-comida")
public class AdminComidaResController {

    @Autowired
    private ComidaService comidaService;

    @GetMapping("/admin-comida")
    public String getAdminComida(Model model) {
        model.addAttribute("comidas", comidaService.getAllComidas());
        return "admin-comida";
    }

    @PostMapping("/agregar-comida")
    public String agregarComida(@RequestParam String nombre, @RequestParam double precio) {
        Comida nuevaComida = new Comida(nombre, precio);
        comidaService.agregarComida(nuevaComida);
        return "redirect:/api/admin-comida/admin-comida";
    }

    @GetMapping("/eliminar-comida/{id}")
    public String eliminarComida(@PathVariable Long id) {
        comidaService.eliminarComida(id);
        return "redirect:/api/admin-comida/admin-comida";
    }

    @GetMapping("/editar-comida/{id}")
    public String editarComida(@PathVariable Long id, Model model) {
        Optional<Comida> comidaOptional = comidaService.getComidaById(id);
        if (comidaOptional.isPresent()) {
            model.addAttribute("comida", comidaOptional.get());
            return "editar-comida"; // nueva vista "editar-comida.html" para la edición de comida
        } else {
            return "redirect:/api/admin-comida/admin-comida";
        }
    }
}
