package edu.poli.factura.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.poli.factura.model.Producto1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class conexion {
	public static Connection conectar() {
		Connection cn= null;
		
		try {
			cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectobd", "root", "t1l2o3t4r5");
			
			if (cn != null) {
				System.out.println("Conexión exitosa");
			}
			else {
				System.out.println("Error en la conexión");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return cn;
	}
public static ObservableList<Producto1> getDataProducto(){
		
		Connection conn= conectar();		
		ObservableList<Producto1> list = FXCollections.observableArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement("select p.codigo, p.nombre , p.precio, p.impuesto,  p.cantidad,  p.tipo,  from proyectobd.producto p inner join proyectobd.consumidor c on p.idConsumidor=c.idConsumidor inner join proyectobd.factura f on c.numero= f.numero where f.numero=1000;");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Producto1(rs.getString("p.codigo"), rs.getString("p.nombre"), Double.parseDouble(rs.getString("p.precio")), Double.parseDouble(rs.getString("p.cantidad")), Integer.parseInt(rs.getString("p.impuesto")), rs.getString("p.tipo")) );
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
}
