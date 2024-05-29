package com.proyecto.cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.proyecto.cine.entity.Usuario;
import com.proyecto.cine.exception.NotFoundException;
import com.proyecto.cine.repository.UsuarioRepository;

@Controller
@RequestMapping("/login")
public class UsuarioTemplateController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String loginTemplate(Model model) {
        return "login";
    }

    @GetMapping("/new")
    public String usuariosNewTemplate(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarios-form";
    }

    @GetMapping("/edit/{id}")
    public String usuarioEditTemplate(@PathVariable("id") String id, Model model) {
        model.addAttribute("usuario", usuarioRepository.findById(id).orElseThrow(() -> new NotFoundException("Usuario no encontrado")));
        return "usuarios-form";
    }

    @PostMapping("/save")
    public String usuariosSaveProcess(@ModelAttribute("usuario") Usuario usuario) {
        if (usuario.getId().isEmpty()) {
            usuario.setId(null);
        }
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }

    @GetMapping("/delete/{id}")
    public String usuarioDeleteProcess(@PathVariable("id") String id) {
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios/";
    }

    @PostMapping("/ingresar")
    public String login(@RequestParam("user") String user,
                        @RequestParam("password") String password,
                        @RequestParam("role") String role,
                        Model model) {
        System.out.println("Usuario: " + user + " Password:" + password + " Rol: " + role);

        if ("admin".equals(role) && "admin".equals(user) && "admin".equals(password)) {
            return "vista-admin"; // Redirige a la vista-admin solo si el rol es administrador y las credenciales son correctas
        }

        Usuario usuario = usuarioRepository.findByUserAndPassword(user, password);

        if (usuario != null) {
            return "reserva"; // Redirige a otra vista si el rol es usuario
        } else {
            model.addAttribute("authenticationFailed", true);
            model.addAttribute("errorMessage", "Usuario o contraseña incorrectos");
            return "login";
        }
    }
    @GetMapping("/admin-usuarios")
    public String adminUsuariosTemplate(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "admin-usuarios";
    }
}

