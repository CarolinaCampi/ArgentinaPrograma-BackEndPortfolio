package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Experiencia;
import com.argentina.programa.backend.repository.IExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public IExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verRedesSociales(){
        return expRepo.findAll();
    };
    @Override
    public void crearExperiencia(Experiencia exp){
        expRepo.save(exp);
    };
    @Override
    public void borrarExperiencia(Long id){
        expRepo.deleteById(id);
    };
    @Override
    public Experiencia buscarExperiencia(Long id){
        return expRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarExperiencia(Experiencia exp){
        expRepo.save(exp);
    };
}
