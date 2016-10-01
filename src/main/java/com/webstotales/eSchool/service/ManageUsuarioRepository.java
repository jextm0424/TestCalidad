package com.webstotales.eSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webstotales.eSchool.domain.Usuario;
import com.webstotales.eSchool.domain.repository.UsuarioRepository;

@Service
public class ManageUsuarioRepository {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Transactional(readOnly=true)
	public List<Usuario> getAll(){
		return usuarioRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Usuario login(String usuario, String password){
		Usuario user = usuarioRepository.login(usuario, password);
		return user == null ? null : user; 
	}
}
