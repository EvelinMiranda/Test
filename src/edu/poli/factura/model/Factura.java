package edu.poli.factura.model;

import java.util.ArrayList;
import java.util.Iterator;

/**



 * 



 */



public class Factura {







    /**



     * 



     */



    private int numero;







    /**



     * 



     */



    private String fecha;







    /**



     * 



     */



    private Almacen almacen;







    /**



     * 



     */



    private Consumidor consumidor;







    /**



     * 



     */



    private ArrayList<Producto> productos;
    
    /**



     * 



     */
    private FormaDePago formadepago;

    










    public Factura(int numero, String fecha, Almacen almacen, Consumidor consumidor, ArrayList<Producto> productos,
			FormaDePago formadepago) {
		
		this.numero = numero;
		this.fecha = fecha;
		this.almacen = almacen;
		this.consumidor = consumidor;
		this.productos = productos;
		this.formadepago = formadepago;
	}







	public int getNumero() {



        return numero;



    }







    public void setNumero(int numero) {



        this.numero = numero;



    }







    public String getFecha() {



        return fecha;



    }







    public void setFecha(String fecha) {



        this.fecha = fecha;



    }







    public Almacen getAlmacen() {



        return almacen;



    }







    public void setAlmacen(Almacen almacen) {



        this.almacen = almacen;



    }







    public Consumidor getConsumidor() {



        return consumidor;



    }







    public void setConsumidor(Consumidor consumidor) {



        this.consumidor = consumidor;



    }







    public ArrayList<Producto> getProductos() {



        return productos;



    }







    public void setProductos(ArrayList<Producto>  productos) {



        this.productos = productos;



    }







    public FormaDePago  getFormadepago() {
		return formadepago;
	}







	public void setFormasdepago(FormaDePago  formasdepago) {
		this.formadepago = formadepago;
	}







	/**



     * @return



     */



    public double calcularTotal() {



        



        double total = 0;



        for (int i = 0; i < productos.size(); i++) {



            Producto p = productos.get(i);



            total += p.getPrecio()*p.getCantidad();



        }



        return total;



    }







    /**



     * @param valorImpuesto 



     * @return



     */



    public double calcularImpuesto() {



    
    	 double total = 0;



         for (int i = 0; i < productos.size(); i++) {



             Producto p = productos.get(i);
             
             total += (p.getPrecio()*p.getImpuesto())*p.getCantidad();
         

            }



            return total/100;


    }
    public double total() {
    	
    	return calcularImpuesto()+calcularTotal();
    }







    /**



     * @param tipo 



     * @return



     */



    public double calcularPorTipo(String tipo) {



        double total = 0;



        for (int i = 0; i < productos.size(); i++) {



            Producto p = productos.get(i);



            if (tipo == p.getTipo())



                total += p.getPrecio();



        }



        return total;    



    }







    @Override



    public String toString() {



        String s="";



        for (int i = 0; i < productos.size(); i++) {



            s+=productos.get(i)+" "+productos.get(i).imprimirCaracteristicas() ;



        }
        
     

        //String i= String.valueOf(calcularImpuesto(10));
       
        return "Factura [Numero=" + numero +" Fecha=" + fecha + "]" + "\n"
         + almacen + "\n"
         +  consumidor + "\n"

       +"Producto="+ s +"\n"
       + "Pago="+formadepago + "\n"
       + "Impuesto=" +String.valueOf(calcularImpuesto())+ "$"+ "\n"
       +  "Total sin IVA="+  String.valueOf(calcularTotal())+ "$"+"\n"
       +"Total ="+ String.valueOf(total())+ "$"+"]";



    }



    



}