package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.Proyecto;
import com.argentina.programa.backend.service.IProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProyectoController {
    @Autowired
    private IProyectoService proyServ;

    @PostMapping("/proyecto")
    public void agregarProyecto (@RequestBody Proyecto proy) {
        proyServ.crearProyecto(proy);
    }
    @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyServ.verProyectos();
    }
    @DeleteMapping ("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proyServ.borrarProyecto(id);
    }

    @GetMapping ("/proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable Long id) {
        return proyServ.buscarProyecto(id);
    }
    @PutMapping ("/proyecto")
    public void modificarProyecto(@RequestBody Proyecto proy){
        proyServ.modificarProyecto(proy);
    }

}
