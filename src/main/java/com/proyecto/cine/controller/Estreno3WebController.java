package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno3WebController {

	@GetMapping("/estreno3")
    public String estreno3() {
        return "estreno3";
	}
}
