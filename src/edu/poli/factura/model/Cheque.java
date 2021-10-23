package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Cheque extends FormaDePago {

    /**
     * Default constructor
     */
	
	

    /**
     * 
     */
    private int numeroCheque;
    private String fechaDeCobro;

	



	public Cheque(String pagoaANombreDe, String identificacion, int numeroCheque, String fechaDeCobro) {
		super(pagoaANombreDe, identificacion);
		this.numeroCheque = numeroCheque;
		this.fechaDeCobro = fechaDeCobro;
	}

	public int getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(int numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public String getFechaDeCobro() {
		return fechaDeCobro;
	}

	public void setFechaDeCobro(String fechaDeCobro) {
		this.fechaDeCobro = fechaDeCobro;
	}

	

   
	
	@Override
	public String toString() {
		return "Cheque [numeroCheque=" + numeroCheque + ", fechaDeCobro=" + fechaDeCobro + ", toString()="
				+ super.toString() + "]";
	}

	public String formasDePago() {
    	return "No olvide indicar la fecha de cobro. ";
    }






	
 
 

	



	
	
}