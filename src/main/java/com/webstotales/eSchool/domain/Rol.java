package com.webstotales.eSchool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_rol")
public class Rol {
	@Column(name="idRol")
	private char id;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="estado")
	private char estado;
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public Rol(char id, String descripcion, char estado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	
}
