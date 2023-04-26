package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.SoftSkill;

import java.util.List;

public interface ISoftSkillService {

    public List<SoftSkill> verSoftSkills();

    public void crearSoftSkill(SoftSkill softSkill);

    public void borrarSoftSkill(Long id);

    public SoftSkill buscarSoftSkill(Long id);

    public void modificarSoftSkill(SoftSkill softSkill);

}
