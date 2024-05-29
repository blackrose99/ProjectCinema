package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno6")
public class Estreno6ResController {

	@GetMapping("/estreno6")
    public String getEstreno6() {
        return "estreno6";
	}
}