package edu.poli.factura.model;

public class Producto {
	private String Id_producto;
	private String nombre;
	private double precio;
	private String tipo;
	private String cantidad;
	public Producto(String id_producto, String nombre, double precio, String tipo,String cantidad) {
		super();
		Id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	public Producto () {
		
	}
	public String getId_producto() {
		return Id_producto;
	}
	public void setId_producto(String id_producto) {
		Id_producto = id_producto;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto: Id_producto=" + Id_producto + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", cantidad="+cantidad
				+ "\n";
	}
	
}
