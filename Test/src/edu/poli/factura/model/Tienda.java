package edu.poli.factura.model;

public class Tienda {
	private String nit;
	private String nombre;
	private String gerente;
	private String direccion;
	private int telefono;
	
	public Tienda(String nit, String nombre, String gerente, String direccion, int telefono) {
		super();
		this.nit = nit;
		this.nombre = nombre;
		this.gerente = gerente;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public Tienda () {
		
	}
	
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Tienda [nit=" + nit + ", nombre=" + nombre + ", gerente=" + gerente + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}




}
