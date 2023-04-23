package com.argentina.programa.backend.repository;


import com.argentina.programa.backend.model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedSocialRepository extends JpaRepository<RedSocial, Long> {
}
