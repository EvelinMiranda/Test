package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public abstract class FormaDePago {

    /**
     * Default constructor
     */
  

    /**
     * 
     */
    private String pagoaANombreDe;
    

    public FormaDePago() {
		super();
	}

	public FormaDePago(String pagoaANombreDe, String identificacion ) {
		super();
		this.pagoaANombreDe = pagoaANombreDe;
		this.identificacion = identificacion;
		
	}

	/**
     * 
     */
    private String identificacion;
    /**
     * 
     */
  

    /**
     * @return
     */
    
    public double metodoPago() {
        // TODO implement here
        return 0.0d;
    }

	public String getPagoaANombreDe() {
		return pagoaANombreDe;
	}

	public void setPagoaANombreDe(String pagoaANombreDe) {
		this.pagoaANombreDe = pagoaANombreDe;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	
	

	
	@Override
	public String toString() {
		return "FormaDePago [pagoaANombreDe=" + pagoaANombreDe  + ", identificacion="
				+ identificacion + "]";
	}

	public String advertencia(){
		return "Elija unicamente una forma de pago. ";
	}
	public abstract String formasDePago() ;
}