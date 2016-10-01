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

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getGrado() {
		return grado;
	}

	public void setGrado(char grado) {
		this.grado = grado;
	}

	public Curso(int idCurso, String nombre, String descripcion, char grado) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.grado = grado;
	}
	
	

}
