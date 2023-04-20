package com.argentina.programa.backend.repository;

import com.argentina.programa.backend.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHeaderRepository extends JpaRepository<Header, Long> {
}
