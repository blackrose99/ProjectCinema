package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno1")
public class Estreno1ResController {

	@GetMapping("/estreno1")
    public String getEstreno1() {
        return "estreno1";
	}
}