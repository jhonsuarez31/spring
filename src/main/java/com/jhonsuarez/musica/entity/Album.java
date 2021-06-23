package com.jhonsuarez.musica.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Albums")

public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private Date lanzado;
	private double precio;
	private String genero;

	public Album() {

	}

	public Album(int id, String titulo, Date lanzado, double precio, String genero) {

		this.id = id;
		this.titulo = titulo;
		this.lanzado = lanzado;
		this.precio = precio;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getLanzado() {
		return lanzado;
	}

	public void setLanzado(Date lanzado) {
		this.lanzado = lanzado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", titulo=" + titulo + ", lanzado=" + lanzado + ", precio=" + precio + ", genero="
				+ genero + "]";
	}

}
