package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/combo-personal")
public class ComboPersonalResController {

	@GetMapping("/combo-personal")
    public String getComboPersonal() {
        return "combo-personal";
	}
}