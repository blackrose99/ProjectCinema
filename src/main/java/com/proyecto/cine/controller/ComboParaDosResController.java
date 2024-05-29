package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/combo-para-dos")
public class ComboParaDosResController {

	@GetMapping("/combo-para-dos")
    public String getComboParaDos() {
        return "combo-para-dos";
	}
}