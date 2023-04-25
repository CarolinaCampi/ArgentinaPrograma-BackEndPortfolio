package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.Curso;
import com.argentina.programa.backend.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CursoController {
    @Autowired
    private ICursoService cursoServ;

    @PostMapping("/curso")
    public void agregarCurso (@RequestBody Curso curso) {
        cursoServ.crearCurso(curso);
    }
    @GetMapping("/curso")
    @ResponseBody
    public List<Curso> verCursos(){
        return cursoServ.verCursos();
    }
    @DeleteMapping ("/curso/{id}")
    public void borrarCurso(@PathVariable Long id) {
        cursoServ.borrarCurso(id);
    }

    @GetMapping ("/curso/{id}")
    @ResponseBody
    public Curso buscarCurso(@PathVariable Long id) {
        return cursoServ.buscarCurso(id);
    }
    @PutMapping ("/curso")
    public void modificarCurso(@RequestBody Curso curso){
        cursoServ.modificarCurso(curso);
    }

}
