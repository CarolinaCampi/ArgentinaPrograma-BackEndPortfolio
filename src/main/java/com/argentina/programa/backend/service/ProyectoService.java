package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Proyecto;
import com.argentina.programa.backend.repository.IProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public IProyectoRepository proyRepo;

    @Override
    public List<Proyecto> verProyectos(){
        return proyRepo.findAll();
    };
    @Override
    public void crearProyecto(Proyecto proy){
        proyRepo.save(proy);
    };
    @Override
    public void borrarProyecto(Long id){
        proyRepo.deleteById(id);
    };
    @Override
    public Proyecto buscarProyecto(Long id){
        return proyRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarProyecto(Proyecto proy){
        proyRepo.save(proy);
    };
}
