package com.argentina.programa.backend.repository;


import com.argentina.programa.backend.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHardSkillRepository extends JpaRepository<HardSkill, Long> {
}
