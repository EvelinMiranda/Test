module Test {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires java.sql;
	requires javafx.base;
	
	opens edu.poli.factura.controller to javafx.graphics, javafx.fxml;
	opens edu.poli.factura.model to javafx.graphics, javafx.fxml;
	
}
