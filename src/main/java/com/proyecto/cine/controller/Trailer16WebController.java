package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer16WebController {

	@GetMapping("/trailer16")
    public String trailer16() {
        return "trailer16";
	}
}
