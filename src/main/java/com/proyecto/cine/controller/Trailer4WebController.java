package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer4WebController {

	@GetMapping("/trailer4")
    public String trailer4() {
        return "trailer4";
	}
}
