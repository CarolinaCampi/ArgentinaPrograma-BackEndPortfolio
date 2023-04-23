package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.EmpresaInstitucion;

import java.util.List;

public interface IEmpresaInstitucionService {

    public List<EmpresaInstitucion> verEmpresaInstituciones();

    public void crearEmpresaInstitucion(EmpresaInstitucion empInst);

    public void borrarEmpresaInstitucion(Long id);

    public EmpresaInstitucion buscarEmpresaInstitucion(Long id);

    public void modificarEmpresaInstitucion(EmpresaInstitucion empInst);

}
