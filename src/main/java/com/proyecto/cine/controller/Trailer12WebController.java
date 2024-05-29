package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer12WebController {

	@GetMapping("/trailer12")
    public String trailer12() {
        return "trailer12";
	}
}
