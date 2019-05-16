package com.example.demo;

public class Usuario {
	
	Long id;	
	String nombre;
	String apellido;
	String pais;
	String nroSerie;
	
	
	public Usuario(String nombre, String apellido, String pais,
			String nroSerie) {
		super();		
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.nroSerie = nroSerie;
	}
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public String getNroSerie() {
		return nroSerie;
	}



	public void setNroSerie(String nroSerie) {
		this.nroSerie = nroSerie;
	}



	@Override
	public String toString() {
		return "UserModel [id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", pais=" + pais + ", nroSerie=" + nroSerie + "]";
	}
	
	
	
}
