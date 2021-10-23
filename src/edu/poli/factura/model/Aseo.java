package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Aseo extends Producto {

    /**
     * Default constructor
     */
   

    /**
     * 
     */
    private boolean esVolatil;

  

	public boolean isEsVolatil() {
		return esVolatil;
	}

	public void setEsVolatil(boolean esVolatil) {
		this.esVolatil = esVolatil;
	}

	public Aseo(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo,
			boolean esVolatil) {
		super(codigo, nombre, precio, cantidad, impuesto, tipo);
		this.esVolatil = esVolatil;
	}

	

	

	/**
     * @return
     */
    public String imprimirComQuimica() {
        // TODO implement here
        return "";
    }

    @Override
	public String toString() {
		return "Aseo [esVolatil=" + esVolatil + ", toString()=" + super.toString() + "]";
	}

	/**
     * @return
     */
    public  String imprimirCaracteristicas() {
    	return "compuesto quimico - ";
    }

}