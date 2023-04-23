package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.Experiencia;
import com.argentina.programa.backend.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ExperienciaController {
    @Autowired
    private IExperienciaService expServ;

    @PostMapping("/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia head) {
        expServ.crearExperiencia(head);
    }
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    @DeleteMapping ("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @GetMapping ("/experiencia/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return expServ.buscarExperiencia(id);
    }
    @PutMapping ("/experiencia")
    public void modificarExperiencia(@RequestBody Experiencia head){
        expServ.modificarExperiencia(head);
    }

}
