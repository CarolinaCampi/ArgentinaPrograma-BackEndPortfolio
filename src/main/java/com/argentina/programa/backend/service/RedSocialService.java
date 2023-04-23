package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.RedSocial;
import com.argentina.programa.backend.repository.IRedSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedSocialService implements IRedSocialService{

    @Autowired
    public IRedSocialRepository redSocialRepo;

    @Override
    public List<RedSocial> verRedesSociales(){
        return redSocialRepo.findAll();
    };
    @Override
    public void crearRedSocial(RedSocial red){
        redSocialRepo.save(red);
    };
    @Override
    public void borrarRedSocial(Long id){
        redSocialRepo.deleteById(id);
    };
    @Override
    public RedSocial buscarRedSocial(Long id){
        return redSocialRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarRedSocial(RedSocial red){
        redSocialRepo.save(red);
    };
}
