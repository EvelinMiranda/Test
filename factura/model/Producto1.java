package edu.poli.factura.model;

public class Producto1 {
	

	public Producto1(String codigo, String nombre, double precio, double cantidad, int impuesto, String tipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.impuesto = impuesto;
		this.tipo = tipo;
	}

	/**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private double precio;

    /**
     * 
     */
    private double cantidad;

    /**
     * 
     */
    private int impuesto;

    /**
     * 
     */
    private String tipo;


    public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public int getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad
				+ ", impuesto=" + impuesto + ", tipo=" + tipo + "]";
	}
}
