package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno9")
public class Estreno9ResController {

	@GetMapping("/estreno9")
    public String getEstreno9() {
        return "estreno9";
	}
}