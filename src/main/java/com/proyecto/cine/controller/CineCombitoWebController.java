package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CineCombitoWebController {

	@GetMapping("/cine-combito")
    public String CineCombito() {
        return "cine-combito";
	}
}
