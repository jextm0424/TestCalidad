package com.webstotales.eSchool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="t_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int idUsuario;
	
	@Column(name="username", unique=true, nullable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="estado", nullable=false)
	private char estado;
	
	@Column(name="email", nullable=false)
	@Email
	private String email;
	
	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@Column(name="apellido", nullable=false)
	private String apellido;
	
	@Column(name="dni",nullable=false)
	private int dni;
	
	@Column(name="direccion",nullable=false)
	private String direccion;
	
	@Column(name="telefono", nullable=false)
	private String telefono;
	
	@Column(name="sexo", nullable=false)
	private char sexo;
	
	@Column(name="grado", nullable=false)
	private char grado;
	
	@Column(name="url",nullable=false)
	private String url;
	
	@Column(name="idRol", nullable=false)
	private Rol idRol;
	
	@Column(name="idSeccion",nullable=false)
	private Seccion idSeccion;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getGrado() {
		return grado;
	}

	public void setGrado(char grado) {
		this.grado = grado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Rol getIdRol() {
		return idRol;
	}

	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	}

	public Seccion getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(Seccion idSeccion) {
		this.idSeccion = idSeccion;
	}

	public Usuario(int idUsuario, String username, String password, char estado, String email, String nombre,
			String apellido, int dni, String direccion, String telefono, char sexo, char grado, String url, Rol idRol,
			Seccion idSeccion) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.sexo = sexo;
		this.grado = grado;
		this.url = url;
		this.idRol = idRol;
		this.idSeccion = idSeccion;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
}
