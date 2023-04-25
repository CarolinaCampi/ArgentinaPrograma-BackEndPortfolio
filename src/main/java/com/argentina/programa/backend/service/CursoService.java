package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Curso;
import com.argentina.programa.backend.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    public ICursoRepository cursoRepo;

    @Override
    public List<Curso> verCursos(){
        return cursoRepo.findAll();
    };
    @Override
    public void crearCurso(Curso curso){
        cursoRepo.save(curso);
    };
    @Override
    public void borrarCurso(Long id){
        cursoRepo.deleteById(id);
    };
    @Override
    public Curso buscarCurso(Long id){
        return cursoRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarCurso(Curso curso){
        cursoRepo.save(curso);
    };
}
