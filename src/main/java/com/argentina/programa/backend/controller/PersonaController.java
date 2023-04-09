package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.Persona;
import com.argentina.programa.backend.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService persoServ;

    @PostMapping ("/persona")
    public void agregarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);
    }
    @GetMapping ("/persona")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    @DeleteMapping ("/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }

    @GetMapping ("/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    @PutMapping ("/persona")
    public void modificarPersona(@RequestBody Persona per){
        persoServ.modificarPersona(per);
    }

}
