package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.RedSocial;
import com.argentina.programa.backend.service.IRedSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RedSocialController {
    @Autowired
    private IRedSocialService redSocialServ;

    @PostMapping("/red_social")
    public void agregarRedSocial (@RequestBody RedSocial red) {
        redSocialServ.crearRedSocial(red);
    }
    @GetMapping("/red_social")
    @ResponseBody
    public List<RedSocial> verRedesSociales(){
        return redSocialServ.verRedesSociales();
    }
    @DeleteMapping ("/red_social/{id}")
    public void borrarRedSocial(@PathVariable Long id) {
        redSocialServ.borrarRedSocial(id);
    }

    @GetMapping ("/red_social/{id}")
    @ResponseBody
    public RedSocial buscarRedSocial(@PathVariable Long id) {
        return redSocialServ.buscarRedSocial(id);
    }
    @PutMapping ("/red_social")
    public void modificarRedSocial(@RequestBody RedSocial red){
        redSocialServ.modificarRedSocial(red);
    }

}
