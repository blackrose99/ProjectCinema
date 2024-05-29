package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ReservaWebController {

	
	
	@GetMapping("/reserva")
    public String reserva() {
        return "reserva";
	}
}
