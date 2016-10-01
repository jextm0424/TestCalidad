package com.webstotales.eSchool.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webstotales.eSchool.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	@Query("select u from Usuario u where u.username=?1 and u.password = ?2")
	Usuario login(String usuario, String password);
}
