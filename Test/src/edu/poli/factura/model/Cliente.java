package edu.poli.factura.model;

public class Cliente {
	private String nombre;
	private int no_documento;
	public Cliente(String nombre, int no_documento) {
		super();
		this.nombre = nombre;
		this.no_documento = no_documento;
	}
	public Cliente () {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNo_documento() {
		return no_documento;
	}
	public void setNo_documento(int no_documento) {
		this.no_documento = no_documento;
	}
	@Override
	public String toString() {
		return "Cliente  [nombre=" + nombre + ", no_documento=" + no_documento + "]"+"\n";
	}
	
	
}
