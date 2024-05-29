package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno2WebController {

	@GetMapping("/estreno2")
    public String estreno2() {
        return "estreno2";
	}
}
