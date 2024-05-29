package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inicio")

public class InicioResController {
	
	@GetMapping("/")
    public String getInicio() {
        return "inicio";
	}
}