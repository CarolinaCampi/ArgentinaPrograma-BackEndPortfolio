package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.SoftSkill;
import com.argentina.programa.backend.repository.ISoftSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftSkillService implements ISoftSkillService{

    @Autowired
    public ISoftSkillRepository softSkillRepo;

    @Override
    public List<SoftSkill> verSoftSkills(){
        return softSkillRepo.findAll();
    };
    @Override
    public void crearSoftSkill(SoftSkill softSkill){
        softSkillRepo.save(softSkill);
    };
    @Override
    public void borrarSoftSkill(Long id){
        softSkillRepo.deleteById(id);
    };
    @Override
    public SoftSkill buscarSoftSkill(Long id){
        return softSkillRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarSoftSkill(SoftSkill softSkill){
        softSkillRepo.save(softSkill);
    };
}
