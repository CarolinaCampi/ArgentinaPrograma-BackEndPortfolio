package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.SoftSkill;
import com.argentina.programa.backend.service.ISoftSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SoftSkillController {
    @Autowired
    private ISoftSkillService softSkillServ;

    @PostMapping("/soft_skill")
    public void agregarSoftSkill (@RequestBody SoftSkill softSkill) {
        softSkillServ.crearSoftSkill(softSkill);
    }
    @GetMapping("/soft_skill")
    @ResponseBody
    public List<SoftSkill> verSoftSkills(){
        return softSkillServ.verSoftSkills();
    }
    @DeleteMapping ("/soft_skill/{id}")
    public void borrarsoftSkill(@PathVariable Long id) {
        softSkillServ.borrarSoftSkill(id);
    }

    @GetMapping ("/soft_skill/{id}")
    @ResponseBody
    public SoftSkill buscarsoftSkill(@PathVariable Long id) {
        return softSkillServ.buscarSoftSkill(id);
    }
    @PutMapping ("/soft_skill")
    public void modificarsoftSkill(@RequestBody SoftSkill softSkill){
        softSkillServ.modificarSoftSkill(softSkill);
    }

}
