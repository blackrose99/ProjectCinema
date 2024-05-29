package com.proyecto.cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.cine.entity.Usuario;
import com.proyecto.cine.exception.NotFoundException;
import com.proyecto.cine.repository.UsuarioRepository;

@Controller
@RequestMapping("/admin-usuarios")
public class AdminUsuariosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String adminUsuariosTemplate(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "admin-usuarios";
    }

    @GetMapping("/editar-usuario/{id}")
    public String editarUsuario(@PathVariable String id, Model model) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
        model.addAttribute("usuario", usuario);
        return "usuarios-form"; // Redirige a la página de formulario de usuarios para la edición
    }

    @GetMapping("/eliminar-usuario/{id}")
    public String eliminarUsuario(@PathVariable String id) {
        usuarioRepository.deleteById(id);
        return "redirect:/admin-usuarios"; // Redirige de nuevo a la página de administración de usuarios
    }
}
