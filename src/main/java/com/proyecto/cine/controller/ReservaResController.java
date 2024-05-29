package com.proyecto.cine.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.cine.entity.AsientosService;
import com.proyecto.cine.entity.Usuario;
import com.proyecto.cine.repository.UsuarioRepository;

import java.security.Principal;
import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("/api/reserva")
public class ReservaResController {
    private final AsientosService asientosService;
    private final UsuarioRepository usuarioRepository;

    public ReservaResController(AsientosService asientosService, UsuarioRepository usuarioRepository) {
        this.asientosService = asientosService;
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/reservar-asientos")
    public ResponseEntity<String> reservarAsientos(@RequestParam String asiento, Principal principal) {
        Usuario usuario = usuarioRepository.findByUser(principal.getName());
        Set<String> asientosOcupados = usuario.getAsientosOcupados();

        if (!asientosOcupados.contains(asiento)) {
            asientosOcupados.add(asiento);
            asientosService.marcarAsientosComoOcupados(Collections.singleton(asiento));

            usuarioRepository.save(usuario);

            return ResponseEntity.ok("Asiento reservado con éxito");
        } else {
            return ResponseEntity.badRequest().body("El asiento ya está ocupado");
        }
    }
}
