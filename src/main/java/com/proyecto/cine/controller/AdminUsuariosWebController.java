package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminUsuariosWebController {

	@GetMapping("/vista-admin")
    public String vistaadmin() {
        return "vista-admin";
	}
}
