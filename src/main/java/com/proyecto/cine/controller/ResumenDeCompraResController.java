package com.proyecto.cine.controller;

import java.security.Principal;
import java.util.Set;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.cine.entity.Usuario;
import com.proyecto.cine.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/resumen-de-compra")
public class ResumenDeCompraResController {

    private final UsuarioRepository usuarioRepository;

    public ResumenDeCompraResController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/resumen-de-compra")
    public String getResumenDeCompra(Principal principal, Model model) {
        // Obtener el usuario actual
        Usuario usuario = usuarioRepository.findByUser(principal.getName());

        // Obtener y mostrar los asientos reservados del usuario actual
        Set<String> asientosReservados = usuario.getAsientosReservados();
        model.addAttribute("asientosReservados", asientosReservados);

        return "resumen-de-compra";
    }
}
