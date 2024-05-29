package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer2WebController {

	@GetMapping("/trailer2")
    public String trailer2() {
        return "trailer2";
	}
}
