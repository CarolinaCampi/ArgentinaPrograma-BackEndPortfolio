package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.EducacionFormal;

import java.util.List;

public interface IEducacionFormalService {


    public List<EducacionFormal> verEducacionFormales();

    public void crearEducacionFormal(EducacionFormal eduForm);

    public void borrarEducacionFormal(Long id);

    public EducacionFormal buscarEducacionFormal(Long id);

    public void modificarEducacionFormal(EducacionFormal eduForm);

}
