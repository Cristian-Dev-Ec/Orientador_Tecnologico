package main.java.com.isusucre.orientador_tecnologico.controller;

@GetMapping("/")
public class OrientadorController {
    @GetMapping("/orientar")
    public String orientar(@RequestParam int opcion) {
        AreaTecnologica area = orientadorService.leerOpcionElegida(opcion);
        if (area != null) {
            model.addAttribute("area", area);
        }
        return "orientar";
    }
}
