package com.webstotales.eSchool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_silabus")
public class Silabus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSilabus;
	
	@Column(name="sumilla")
	private String sumilla;
	
	@Column(name="numUnd")
	private int numUnd;
	
	@Column(name="grado")
	private char grado;
	
	@Column(name="numhxs")
	private int numhxs;
	
	@Column(name="year")
	private int year;
	
	@Column(name="idCurso")
	private Curso curso;

	public int getIdSilabus() {
		return idSilabus;
	}

	public void setIdSilabus(int idSilabus) {
		this.idSilabus = idSilabus;
	}

	public String getSumilla() {
		return sumilla;
	}

	public void setSumilla(String sumilla) {
		this.sumilla = sumilla;
	}

	public int getNumUnd() {
		return numUnd;
	}

	public void setNumUnd(int numUnd) {
		this.numUnd = numUnd;
	}

	public char getGrado() {
		return grado;
	}

	public void setGrado(char grado) {
		this.grado = grado;
	}

	public int getNumhxs() {
		return numhxs;
	}

	public void setNumhxs(int numhxs) {
		this.numhxs = numhxs;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Silabus(int idSilabus, String sumilla, int numUnd, char grado, int numhxs, int year, Curso curso) {
		super();
		this.idSilabus = idSilabus;
		this.sumilla = sumilla;
		this.numUnd = numUnd;
		this.grado = grado;
		this.numhxs = numhxs;
		this.year = year;
		this.curso = curso;
	}
	
	public Silabus() {
		// TODO Auto-generated constructor stub
	}
}
