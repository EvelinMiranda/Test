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

	
}
