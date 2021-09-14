package com.prueba.demo.core.model;
  
public class Producto {

	private Integer cod_producto;
	private String nombre;
	private double precio;
	
	public Integer getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(Integer cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
