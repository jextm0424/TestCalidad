package com.webstotales.eSchool.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_profesor")
public class Profesor {

	@Id
	int idProfesor;
	@Column
	String nombre;
	@Column
	String apellido;
	@Column
	Date fec_nac;
	public int getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFec_nac() {
		return fec_nac;
	}
	public void setFec_nac(Date fec_nac) {
		this.fec_nac = fec_nac;
	}
	public Profesor(int idProfesor, String nombre, String apellido, Date fec_nac) {
		super();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fec_nac = fec_nac;
	}
	
	
	
	
}
