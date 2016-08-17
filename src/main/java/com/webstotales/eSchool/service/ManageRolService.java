package com.webstotales.eSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webstotales.eSchool.domain.Rol;
import com.webstotales.eSchool.domain.repository.RolRepository;

@Service
public class ManageRolService {
	@Autowired
	private RolRepository rolrepository;
	
	@Transactional(readOnly=true)
	public List<Rol> getAll(){
		return rolrepository.findAll();
	}
	
	@Transactional
	public Rol add(Rol rol){
		return rolrepository.saveAndFlush(rol);
	}
	@Transactional
	public Rol save(Rol rol){
		return rolrepository.save(rol);
	}
	@Transactional
	public void delete(Character id){
		rolrepository.delete(id);
	}
}
