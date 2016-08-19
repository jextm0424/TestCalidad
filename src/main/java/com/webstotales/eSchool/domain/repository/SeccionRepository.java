package com.webstotales.eSchool.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webstotales.eSchool.domain.Seccion;

@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Integer>{

}
