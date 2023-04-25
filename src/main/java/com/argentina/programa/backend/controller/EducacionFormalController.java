package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.EducacionFormal;
import com.argentina.programa.backend.service.IEducacionFormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EducacionFormalController {
    @Autowired
    private IEducacionFormalService eduFormServ;

    @PostMapping("/educacion_formal")
    public void agregarEducacionFormal (@RequestBody EducacionFormal eduForm) {
        eduFormServ.crearEducacionFormal(eduForm);
    }
    @GetMapping("/educacion_formal")
    @ResponseBody
    public List<EducacionFormal> verEducacionFormales(){
        return eduFormServ.verEducacionFormales();
    }
    @DeleteMapping ("/educacion_formal/{id}")
    public void borrarEducacionFormal(@PathVariable Long id) {
        eduFormServ.borrarEducacionFormal(id);
    }

    @GetMapping ("/educacion_formal/{id}")
    @ResponseBody
    public EducacionFormal buscarEducacionFormal(@PathVariable Long id) {
        return eduFormServ.buscarEducacionFormal(id);
    }
    @PutMapping ("/educacion_formal")
    public void modificarEducacionFormal(@RequestBody EducacionFormal eduForm){
        eduFormServ.modificarEducacionFormal(eduForm);
    }

}
