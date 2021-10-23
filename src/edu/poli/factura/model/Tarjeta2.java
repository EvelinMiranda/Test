package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Tarjeta2 extends FormaDePago {

    /**
     * Default constructor
     */
	

    /**
     * 
     */
    private String numeroTarjeta;

   
	

	public Tarjeta2(String pagoaANombreDe, String identificacion) {
		super(pagoaANombreDe, identificacion);
	}

	public Tarjeta2(String pagoaANombreDe, String identificacion, String numeroTarjeta, String titular) {
		super(pagoaANombreDe, identificacion);
		this.numeroTarjeta = numeroTarjeta;
		this.titular = titular;
	}

	/**
     * 
     */
    private String titular;

    /**
     * @return
     */
    
    public String formasDePago() {
    	return "Puede realizar su pago a cuotas. ";
    }

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Tarjeta [numeroTarjeta=" + numeroTarjeta + ", titular=" + titular + ", toString()=" + super.toString()
				+ "]";
	}

	
}