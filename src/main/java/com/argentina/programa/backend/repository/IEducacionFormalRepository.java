package com.argentina.programa.backend.repository;


import com.argentina.programa.backend.model.EducacionFormal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionFormalRepository extends JpaRepository<EducacionFormal, Long> {
}
