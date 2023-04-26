package com.argentina.programa.backend.repository;


import com.argentina.programa.backend.model.Curso;
import com.argentina.programa.backend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Long> {
}
