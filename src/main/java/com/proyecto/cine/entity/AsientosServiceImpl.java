package com.proyecto.cine.entity;

import org.springframework.stereotype.Service;

import com.proyecto.cine.repository.UsuarioRepository;

import java.util.Set;

@Service
public class AsientosServiceImpl implements AsientosService {
    private final UsuarioRepository usuarioRepository;

    public AsientosServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Set<String> getAsientosReservados() {
        return usuarioRepository.findAll().stream()
                .findFirst()  // Tomamos solo el primer usuario (ajusta según tu lógica)
                .map(Usuario::getAsientosReservados)
                .orElse(Set.of());
    }

    @Override
    public void marcarAsientosComoOcupados(Set<String> asientos) {
        // Tomamos solo el primer usuario (ajusta según tu lógica)
        usuarioRepository.findAll().stream()
                .findFirst()
                .ifPresent(usuario -> {
                    usuario.getAsientosOcupados().addAll(asientos);
                    usuarioRepository.save(usuario);
                });
    }
}
