package com.proyecto.cine.controller;

import java.security.Principal;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.cine.entity.AsientosService;
import com.proyecto.cine.entity.Usuario;
import com.proyecto.cine.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/tickect")
public class tickectResController {

    private final AsientosService asientosService;
    private final UsuarioRepository usuarioRepository;

    public tickectResController(AsientosService asientosService, UsuarioRepository usuarioRepository) {
        this.asientosService = asientosService;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/confirmar-reserva")
    public String confirmarReserva(@RequestParam String movieName, Principal principal) {
        // Obtener el usuario actual
        Usuario usuario = usuarioRepository.findByUser(principal.getName());

        // Obtener los asientos reservados del usuario actual
        Set<String> asientosReservados = usuario.getAsientosReservados();

        // Marcar asientos como ocupados
        asientosService.marcarAsientosComoOcupados(asientosReservados);

        return "redirect:/api/resumen-de-compra";
    }
}
