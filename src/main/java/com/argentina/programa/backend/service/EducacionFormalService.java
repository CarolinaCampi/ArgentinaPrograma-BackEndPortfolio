package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.EducacionFormal;
import com.argentina.programa.backend.repository.IEducacionFormalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionFormalService implements IEducacionFormalService{

    @Autowired
    public IEducacionFormalRepository eduFormRepo;

    @Override
    public List<EducacionFormal> verEducacionFormales(){
        return eduFormRepo.findAll();
    };
    @Override
    public void crearEducacionFormal(EducacionFormal eduForm){
        eduFormRepo.save(eduForm);
    };
    @Override
    public void borrarEducacionFormal(Long id){
        eduFormRepo.deleteById(id);
    };
    @Override
    public EducacionFormal buscarEducacionFormal(Long id){
        return eduFormRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarEducacionFormal(EducacionFormal eduForm){
        eduFormRepo.save(eduForm);
    };
}
