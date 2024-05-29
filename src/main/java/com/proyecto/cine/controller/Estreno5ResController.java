package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno5")
public class Estreno5ResController {

	@GetMapping("/estreno5")
    public String getEstreno5() {
        return "estreno5";
	}
}