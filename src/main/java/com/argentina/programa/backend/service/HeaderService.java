package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Header;
import com.argentina.programa.backend.repository.IHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeaderService implements IHeaderService{

    @Autowired
    public IHeaderRepository headerRepo;

    @Override
    public List<Header> verHeaders(){
        return headerRepo.findAll();
    };
    @Override
    public void crearHeader(Header head){
        headerRepo.save(head);
    };
    @Override
    public void borrarHeader(Long id){
        headerRepo.deleteById(id);
    };
    @Override
    public Header buscarHeader(Long id){
        return headerRepo.findById(id).orElse(null);
    };
    @Override
    public void modificarHeader(Header head){
        headerRepo.save(head);
    };
}
