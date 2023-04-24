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
    private IEducacionFormalService empInstServ;

    @PostMapping("/educacion_formal")
    public void agregarEducacionFormal (@RequestBody EducacionFormal empInst) {
        empInstServ.crearEducacionFormal(empInst);
    }
    @GetMapping("/educacion_formal")
    @ResponseBody
    public List<EducacionFormal> verEducacionFormales(){
        return empInstServ.verEducacionFormales();
    }
    @DeleteMapping ("/educacion_formal/{id}")
    public void borrarEducacionFormal(@PathVariable Long id) {
        empInstServ.borrarEducacionFormal(id);
    }

    @GetMapping ("/educacion_formal/{id}")
    @ResponseBody
    public EducacionFormal buscarEducacionFormal(@PathVariable Long id) {
        return empInstServ.buscarEducacionFormal(id);
    }
    @PutMapping ("/educacion_formal")
    public void modificarEducacionFormal(@RequestBody EducacionFormal eduForm){
        empInstServ.modificarEducacionFormal(eduForm);
    }

}
