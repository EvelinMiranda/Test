package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Alimento extends Producto {

    /**
     * Default constructor
     */
   

    public Alimento(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo) {
		super(codigo, nombre, precio, cantidad, impuesto, tipo);
	}

	/**
     * 
     */
    private double grAzucar;

   
	

	public double getGrAzucar() {
		return grAzucar;
	}

	public void setGrAzucar(double grAzucar) {
		this.grAzucar = grAzucar;
	}

	/**
     * @return
     */
    public String imprimirTablaNutricional() {
        // TODO implement here
        return "";
    }

    @Override
	public String toString() {
		return "Alimento [grAzucar=" + grAzucar + ", toString()=" + super.toString() + "]";
	}

	/**
     * @return
     */
    public  String imprimirCaracteristicas() {
    	return "tabla nutricional - ";
    }

}