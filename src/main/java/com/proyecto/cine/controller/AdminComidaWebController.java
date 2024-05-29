// AdminComidaWebController.java
package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminComidaWebController {

    @GetMapping("/admin-comida")
    public String vistaadmin() {
        return "admin-comida";
    }
}
