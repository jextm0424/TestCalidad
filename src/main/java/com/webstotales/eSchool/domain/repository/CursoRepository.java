package com.webstotales.eSchool.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webstotales.eSchool.domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
