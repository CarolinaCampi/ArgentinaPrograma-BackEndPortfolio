package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.EmpresaInstitucion;
import com.argentina.programa.backend.repository.IEmpresaInstitucionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaInstitucionService implements IEmpresaInstitucionService{

    @Autowired
    public IEmpresaInstitucionRepository empInstRepo;

    @Override
    public List<EmpresaInstitucion> verEmpresaInstituciones(){
        return empInstRepo.findAll();
    };
    @Override
    public void crearEmpresaInstitucion(EmpresaInstitucion empInst){
        empInstRepo.save(empInst);
    };
    @Override
    public void borrarEmpresaInstitucion(Long id){
        empInstRepo.deleteById(id);
    };
    @Override
    public EmpresaInstitucion buscarEmpresaInstitucion(Long id){
        return empInstRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarEmpresaInstitucion(EmpresaInstitucion empInst){
        empInstRepo.save(empInst);
    };
}
