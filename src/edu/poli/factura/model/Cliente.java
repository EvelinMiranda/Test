package edu.poli.factura.model;



import java.util.*;

/**
 * 
 */
public class Cliente {

    public static void main(String [ ] args) {
    	Almacen almacen1= new Almacen("123", "bogota", "calle 8","camilo", "1235234");
    	Consumidor consumidor1= new Consumidor("pedro", "33", "34");
    	Cheque cheque1= new Cheque(consumidor1.getNombre(), "142536475869", 3254, "12/12/2012");
    	Efectivo efectivo1= new Efectivo(null,"123456", 5000000);
    	Tarjeta tarjeta1= new Tarjeta(null, null, null, null);

    	
     Aseo aseo1= new Aseo("1234", "jabon", 500, 1, 10, "Aseo", true );
     Producto [] productos = new Producto [1];
     productos[0]=aseo1;
     FormaDePago [] modoDePago= new FormaDePago [3];
     modoDePago[0]=cheque1;
     modoDePago[1]=efectivo1;
     modoDePago[2]=tarjeta1;
    
     
		//Factura factura1= new Factura(23, "12/32/2021",almacen1 , consumidor1, productos, modoDePago);
		//System.out.println(factura1);
		
	
    }

}