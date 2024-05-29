package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno8")
public class Estreno8ResController {

	@GetMapping("/estreno8")
    public String getEstreno8() {
        return "estreno8";
	}
}