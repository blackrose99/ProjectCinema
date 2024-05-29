package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno1WebController {

	@GetMapping("/estreno1")
    public String estreno1() {
        return "estreno1";
	}
}
