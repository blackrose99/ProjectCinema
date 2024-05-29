package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/confiteria")

public class ConfiteriaResController {
	@GetMapping("/confiteria")
    public String getConfiteria() {
        return "confiteria";
	}
}
