package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno9WebController {

	@GetMapping("/estreno9")
    public String estreno9() {
        return "estreno9";
	}
}
