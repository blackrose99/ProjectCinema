package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno6WebController {

	@GetMapping("/estreno6")
    public String estreno6() {
        return "estreno6";
	}
}
