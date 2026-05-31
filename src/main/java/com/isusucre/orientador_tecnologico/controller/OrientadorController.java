package com.isusucre.orientador_tecnologico.controller;

import com.isusucre.orientador_tecnologico.model.AreaTecnologica;
import com.isusucre.orientador_tecnologico.service.OrientadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrientadorController {

    private final OrientadorService orientadorService;

    public OrientadorController(OrientadorService orientadorService) {
        this.orientadorService = orientadorService;
    }

    @GetMapping("/orientar")
    public String orientar(@RequestParam int opcion, Model model) {
        AreaTecnologica area = orientadorService.leerOpcionElegida(opcion);
        if (area != null) {
            model.addAttribute("area", area);
        }
        return "orientar";
    }
}
