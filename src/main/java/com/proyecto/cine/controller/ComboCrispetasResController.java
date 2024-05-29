package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/combo-crispetas")
public class ComboCrispetasResController {

	@GetMapping("/combo-crispetas")
    public String getComboCrispetas() {
        return "combo-crispetas";
	}
}