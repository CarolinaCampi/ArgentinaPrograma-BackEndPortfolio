package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.HardSkill;

import java.util.List;

public interface IHardSkillService {

    public List<HardSkill> verHardSkills();

    public void crearHardSkill(HardSkill hardSkill);

    public void borrarHardSkill(Long id);

    public HardSkill buscarHardSkill(Long id);

    public void modificarHardSkill(HardSkill hardSkill);

}
