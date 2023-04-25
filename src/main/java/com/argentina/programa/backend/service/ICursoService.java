package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Curso;

import java.util.List;

public interface ICursoService {


    public List<Curso> verCursos();

    public void crearCurso(Curso curso);

    public void borrarCurso(Long id);

    public Curso buscarCurso(Long id);

    public void modificarCurso(Curso curso);

}
