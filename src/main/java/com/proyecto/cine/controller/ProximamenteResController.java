package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proximamente")

public class ProximamenteResController {
	
	@GetMapping("/proximamente")
    public String getProximamente() {
        return "proximamente";
	}
}