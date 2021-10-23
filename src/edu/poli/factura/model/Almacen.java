package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Almacen {

    /**
     * Default constructor
     */
   

    /**
     * 
     */
    private String nit;

    public Almacen(String nit, String nombre, String direccion, String nombreGerente, String telefono) {
		super();
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.nombreGerente = nombreGerente;
		this.telefono = telefono;
	}

	public Almacen() {
		// TODO Auto-generated constructor stub
	}

	/**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String direccion;

    /**
     * 
     */
    private String nombreGerente;

    /**
     * 
     */
    private String telefono;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreGerente() {
		return nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Almacen [nit=" + nit + ", nombre=" + nombre + ", direccion=" + direccion + ", nombreGerente="
				+ nombreGerente + ", telefono=" + telefono  + "]";
	}


}