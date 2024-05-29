// AdminComidaWebController.java
package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPeliculaWebController {

    @GetMapping("/admin-peliculas")
    public String vistaadmin() {
        return "admin-peliculas";
    }
}
