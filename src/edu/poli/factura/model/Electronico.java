package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Electronico extends Producto {

    /**
     * Default constructor
     */
   

    /**
     * 
     */
    private int inputVoltaje;

    public Electronico(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo,
			int inputVoltaje) {
		super(codigo, nombre, precio, cantidad, impuesto, tipo);
		this.inputVoltaje = inputVoltaje;
	}

	/**
     * @return
     */
    public String imprimirFichaTecnica() {
        // TODO implement here
        return "";
    }

    public int getInputVoltaje() {
		return inputVoltaje;
	}

	public void setInputVoltaje(int inputVoltaje) {
		this.inputVoltaje = inputVoltaje;
	}

	@Override
	public String toString() {
		return "Electronico [inputVoltaje=" + inputVoltaje + ", toString()=" + super.toString() + "]";
	}

	/**
     * @return
     */
    public  String imprimirCaracteristicas() {
    	return "ficha tecnica - ";
    }

}