package com.webstotales.eSchool.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.webstotales.eSchool.domain.Profesor;

@EnableJpaRepositories
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

}
