package edu.poli.factura.model;

import java.util.ArrayList;

public class Factura {
	private String id_factura;

    private String fecha;
    private Tienda tienda;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
	public Factura() {
		super();
	}
	public Factura(String id_factura, String fecha, Tienda tienda, Cliente cliente, ArrayList<Producto> productos) {
		super();
		this.id_factura = id_factura;
		this.fecha = fecha;
		this.tienda = tienda;
		this.cliente = cliente;
		this.productos = productos;
	}
	public String getId_factura() {
		return id_factura;
	}
	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Tienda getTienda() {
		return tienda;
	}
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", fecha=" + fecha +"]"+ "\n"+ 
	 tienda + "\n"+
				 cliente
				+ "\n"+  productos + "]";
	}
    
    
 }
