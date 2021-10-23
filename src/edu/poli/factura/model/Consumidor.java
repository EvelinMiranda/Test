package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Consumidor {

    /**
     * Default constructor
     */
  

    /**
     * 
     */
    private String nombre;

    public Consumidor(String nombre, String numeroTarjeta, String puntos) {
		super();
		this.nombre = nombre;
		this.numeroTarjeta = numeroTarjeta;
		this.puntos = puntos;
	}

	public Consumidor() {
		// TODO Auto-generated constructor stub
	}

	/**
     * 
     */
    private String numeroTarjeta;

    /**
     * 
     */
    private String puntos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Consumidor [nombre=" + nombre + ", numeroTarjeta=" + numeroTarjeta + ", puntos=" + puntos + "]";
	}
	


}