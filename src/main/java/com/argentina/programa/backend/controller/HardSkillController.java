package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.HardSkill;
import com.argentina.programa.backend.service.IHardSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HardSkillController {
    @Autowired
    private IHardSkillService hardSkillServ;

    @PostMapping("/hard_skill")
    public void agregarHardSkill (@RequestBody HardSkill hardSkill) {
        hardSkillServ.crearHardSkill(hardSkill);
    }
    @GetMapping("/hard_skill")
    @ResponseBody
    public List<HardSkill> verHardSkills(){
        return hardSkillServ.verHardSkills();
    }
    @DeleteMapping ("/hard_skill/{id}")
    public void borrarhardSkill(@PathVariable Long id) {
        hardSkillServ.borrarHardSkill(id);
    }

    @GetMapping ("/hard_skill/{id}")
    @ResponseBody
    public HardSkill buscarhardSkill(@PathVariable Long id) {
        return hardSkillServ.buscarHardSkill(id);
    }
    @PutMapping ("/hard_skill")
    public void modificarhardSkill(@RequestBody HardSkill hardSkill){
        hardSkillServ.modificarHardSkill(hardSkill);
    }

}
