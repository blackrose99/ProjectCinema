package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cine-combito")
public class CineCombitoResController {

	@GetMapping("/cine-combito")
    public String getCineCombito() {
        return "cine-combito";
	}
}