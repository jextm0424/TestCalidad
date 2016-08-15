package com.webstotales.eSchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.webstotales.eSchool.domain.Alumno;
import com.webstotales.eSchool.domain.repository.AlumnoRepository;

@Service
public class ManageAlumnoService {
		@Autowired
		private AlumnoRepository alumnoRepository;
		
		
		@Transactional(readOnly=true)
		public List<Alumno> getAll(){
			return alumnoRepository.findAll();
		}
		@Transactional
		public Alumno addAlumno(Alumno alumno){
			return alumnoRepository.saveAndFlush(alumno);
		}
		
		@Transactional
		public Alumno saveAlumno(Alumno alumno){
			return alumnoRepository.save(alumno);
		}
		@Transactional
		public void flushAlumno(){
			alumnoRepository.flush();
		}
}
