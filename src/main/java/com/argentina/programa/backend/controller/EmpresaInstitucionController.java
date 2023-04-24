package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.EmpresaInstitucion;
import com.argentina.programa.backend.service.IEmpresaInstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmpresaInstitucionController {
    @Autowired
    private IEmpresaInstitucionService empInstServ;

    @PostMapping("/empresa_institucion")
    public void agregarEmpresaInstitucion (@RequestBody EmpresaInstitucion empInst) {
        empInstServ.crearEmpresaInstitucion(empInst);
    }
    @GetMapping("/empresa_institucion")
    @ResponseBody
    public List<EmpresaInstitucion> verEmpresaInstituciones(){
        return empInstServ.verEmpresaInstituciones();
    }
    @DeleteMapping ("/empresa_institucion/{id}")
    public void borrarEmpresaInstitucion(@PathVariable Long id) {
        empInstServ.borrarEmpresaInstitucion(id);
    }

    @GetMapping ("/empresa_institucion/{id}")
    @ResponseBody
    public EmpresaInstitucion buscarEmpresaInstitucion(@PathVariable Long id) {
        return empInstServ.buscarEmpresaInstitucion(id);
    }
    @PutMapping ("/empresa_institucion")
    public void modificarEmpresaInstitucion(@RequestBody EmpresaInstitucion empInst){
        empInstServ.modificarEmpresaInstitucion(empInst);
    }

}
