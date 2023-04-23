package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Experiencia;

import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> verExperiencias();

    public void crearExperiencia(Experiencia red);

    public void borrarExperiencia(Long id);

    public Experiencia buscarExperiencia(Long id);

    public void modificarExperiencia(Experiencia red);

}
