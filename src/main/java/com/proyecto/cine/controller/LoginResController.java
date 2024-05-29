package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/login")
public class LoginResController {

    @GetMapping("/")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/authenticate")
    public String authenticateUser(Model model, @RequestParam("user") String user, @RequestParam("password") String password) {
        // Aquí debes realizar la lógica de autenticación
        // Verificar credenciales y, si son válidas, redirigir a la página de reservas

        // Ejemplo simple: verificar si las credenciales son "admin" y "password"
        if ("admin".equals(user) && "password".equals(password)) {
            // Autenticación exitosa, redirigir a la página de reservas
            return "redirect:/api/reserva/resumen-de-compra";
        } else {
            // Autenticación fallida, mostrar un mensaje de error en la página de inicio de sesión
            model.addAttribute("authenticationFailed", true);
            model.addAttribute("errorMessage", "Usuario o contraseña incorrectos");
            return "login";
        }
    }
}
