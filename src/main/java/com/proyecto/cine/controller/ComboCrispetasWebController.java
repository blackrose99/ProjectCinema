package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComboCrispetasWebController {

	@GetMapping("/combo-crispetas")
    public String ComboCrispetas() {
        return "combo-crispetas";
	}
}
