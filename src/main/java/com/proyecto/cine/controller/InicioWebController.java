package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class InicioWebController {

	@GetMapping("/")
    public String inicio() {
        return "inicio";
	}
}
