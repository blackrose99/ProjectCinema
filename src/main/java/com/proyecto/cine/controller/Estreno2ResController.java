package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno2")
public class Estreno2ResController {

	@GetMapping("/estreno2")
    public String getEstreno2() {
        return "estreno2";
	}
}