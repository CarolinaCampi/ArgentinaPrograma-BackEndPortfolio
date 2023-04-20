package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Header;

import java.util.List;

public interface IHeaderService {
    public List<Header> verHeaders();
    public void crearHeader(Header head);
    public void borrarHeader(Long id);
    public Header buscarHeader(Long id);
    public void modificarHeader(Header head);
}
