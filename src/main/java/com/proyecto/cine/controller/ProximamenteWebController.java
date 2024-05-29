package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProximamenteWebController {

	@GetMapping("/proximamente")
    public String proximamente() {
        return "proximamente";
	}
}
