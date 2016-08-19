package com.webstotales.eSchool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCurso;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="grado")
	private char grado;

}
