package com.webstotales.eSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webstotales.eSchool.domain.Profesor;
import com.webstotales.eSchool.domain.repository.ProfesorRepository;

@Service
public class ManageProfesorService {
	
	@Autowired
	private ProfesorRepository profesorRepository;
	
	@Transactional(readOnly=true)
	public List<Profesor> getAll(){
		return profesorRepository.findAll();
	}
	@Transactional
	public Profesor addProfesorSaveAndFlush(Profesor profe){
		return profesorRepository.saveAndFlush(profe);
	}
	@Transactional
	public Profesor addProfesorSave(Profesor profe){
		return profesorRepository.save(profe);
	}
	
}
