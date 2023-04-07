package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Persona;
import com.argentina.programa.backend.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService  {

    @Autowired
    public IPersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }
    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }
    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    @Override
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    }
}
