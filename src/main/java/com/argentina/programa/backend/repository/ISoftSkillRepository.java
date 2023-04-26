package com.argentina.programa.backend.repository;


import com.argentina.programa.backend.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISoftSkillRepository extends JpaRepository<SoftSkill, Long> {
}
