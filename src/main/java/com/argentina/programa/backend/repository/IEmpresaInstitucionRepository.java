package com.argentina.programa.backend.repository;


import com.argentina.programa.backend.model.EmpresaInstitucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaInstitucionRepository extends JpaRepository<EmpresaInstitucion, Long> {
}
