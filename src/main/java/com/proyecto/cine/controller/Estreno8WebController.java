package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno8WebController {

	@GetMapping("/estreno8")
    public String estreno8() {
        return "estreno8";
	}
}
