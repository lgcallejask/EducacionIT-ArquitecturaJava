package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;	
	
	String nombre;
	String apellido;
	String pais;
	String nroSerie;
	
	
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
