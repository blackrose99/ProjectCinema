package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno5WebController {

	@GetMapping("/estreno5")
    public String estreno5() {
        return "estreno5";
	}
}
