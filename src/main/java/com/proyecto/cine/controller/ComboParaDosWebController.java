package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComboParaDosWebController {

	@GetMapping("/combo-para-dos")
    public String ComboParaDos() {
        return "combo-para-dos";
	}
}
