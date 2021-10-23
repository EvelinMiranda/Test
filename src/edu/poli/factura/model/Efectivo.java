package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Efectivo extends FormaDePago {

 





public Efectivo(String pagoaANombreDe, String identificacion, double cantidadRecivida) {
		super(pagoaANombreDe, identificacion);
		this.cantidadRecivida = cantidadRecivida;
	}





private double cantidadRecivida;
   
    
    public double getCantidadRecivida() {
	return cantidadRecivida;
}


public void setCantidadRecivida(double cantidadRecivida) {
	this.cantidadRecivida = cantidadRecivida;
}


	@Override
public String toString() {
	return "Efectivo [cantidadRecivida=" + cantidadRecivida + ", toString()=" + super.toString() + "]";
}


	public String formasDePago() {
    	return "Debe cancelar el total de la compra en pesos Colombianos. ";
    }
}