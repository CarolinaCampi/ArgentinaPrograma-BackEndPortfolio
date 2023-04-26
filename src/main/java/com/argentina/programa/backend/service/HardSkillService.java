package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.HardSkill;
import com.argentina.programa.backend.repository.IHardSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardSkillService implements IHardSkillService{

    @Autowired
    public IHardSkillRepository hardSkillRepo;

    @Override
    public List<HardSkill> verHardSkills(){
        return hardSkillRepo.findAll();
    };
    @Override
    public void crearHardSkill(HardSkill hardSkill){
        hardSkillRepo.save(hardSkill);
    };
    @Override
    public void borrarHardSkill(Long id){
        hardSkillRepo.deleteById(id);
    };
    @Override
    public HardSkill buscarHardSkill(Long id){
        return hardSkillRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarHardSkill(HardSkill hardSkill){
        hardSkillRepo.save(hardSkill);
    };
}
