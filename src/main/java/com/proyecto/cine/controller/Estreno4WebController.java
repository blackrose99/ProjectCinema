package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno4WebController {

	@GetMapping("/estreno4")
    public String estreno4() {
        return "estreno4";
	}
}
