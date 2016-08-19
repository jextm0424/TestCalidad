package com.webstotales.eSchool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_seccion")
public class Seccion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSeccion;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
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

	public Seccion(int idSeccion, String nombre, String descripcion) {
		super();
		this.idSeccion = idSeccion;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	
	
}
