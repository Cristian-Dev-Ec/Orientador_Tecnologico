package com.isusucre.orientador_tecnologico.controller;

import com.isusucre.orientador_tecnologico.model.AreaTecnologica;
import com.isusucre.orientador_tecnologico.service.OrientadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.*;

@Controller
@AllArgsConstructor
public class OrientadorController {

    private final OrientadorService orientadorService;

    @GetMapping("/")
    public String mostrarMenu() {
        return "index";
    }

    @GetMapping("/orientar")
    public String orientar(@RequestParam int opcion, 
                            @RequestParam(required = false) String plataforma, 
                            Model model) {
        if (opcion == 5) {
            return "despedida";
        }

        // Le pasamos la plataforma elegida al servicio
        AreaTecnologica area = orientadorService.leerOpcionElegida(opcion, plataforma);
        
        if (area != null) {
            model.addAttribute("area", area);
            String[] lenguajesArray = area.getLenguajesRecomendados().split(",\\s*");
            model.addAttribute("listaLenguajes", lenguajesArray);
            return "resultado";
        }
        return "redirect:/";
    }
}
