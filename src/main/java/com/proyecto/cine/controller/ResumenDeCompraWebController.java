package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ResumenDeCompraWebController {
	@GetMapping("/resumen-de-compra")
    public String resumendecompra() {
        return "resumen-de-compra";
	}
}

