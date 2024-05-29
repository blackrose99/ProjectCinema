package com.proyecto.cine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.cine.entity.Usuario;
import com.proyecto.cine.exception.NotFoundException;
import com.proyecto.cine.repository.UsuarioRepository;



@RestController
@RequestMapping(value = "/api/login")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    

    @GetMapping("/login")
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable String id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
    }

    @PostMapping("/")
    public Usuario saveUsuario(@RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Usuario usuario = mapper.convertValue(body, Usuario.class);
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable String id, @RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Usuario usuario = mapper.convertValue(body, Usuario.class);
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public Usuario deleteUsuario(@PathVariable String id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
        usuarioRepository.deleteById(id);
        return usuario;
    }

    @PostMapping("/create-default-admin")
    public Usuario createDefaultAdmin() {
        Usuario admin = new Usuario();
        admin.setUser("admin");
        admin.setPassword("admin");
        admin.setAdmin(true);
        return usuarioRepository.save(admin);
    }
   
    }


