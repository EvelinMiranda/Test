package edu.poli.factura.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;




import edu.poli.factura.model.Producto1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class FormController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TabPane tabpane1;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt3;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt4;

    @FXML
    private Button ok1;

    @FXML
    private TextField tex6;

    @FXML
    private TextField tex7;

    @FXML
    private Button ok2;

    @FXML
    private TextField tex13;

    @FXML
    private TextField tex8;

    @FXML
    private TextField tex9;

    @FXML
    private TextField tex10;

    @FXML
    private TextField tex11;

    @FXML
    private TextField tex12;

    @FXML
    private Button ok3;

    @FXML
    private RadioButton opt1;

    @FXML
    private RadioButton opt2;

    @FXML
    private RadioButton opt3;

    @FXML
    private CheckBox check1;

    @FXML
    private TextField tex15;

    @FXML
    private CheckBox check2;

    @FXML
    private TextField tex16;

    @FXML
    private CheckBox check3;

    @FXML
    private TextField tex17;

    @FXML
    private TextField tex18;

    @FXML
    private Button ok4;

    @FXML
    private DatePicker date1;
    @FXML
    private TextField txt19;
    @FXML
    private TextField txt20;

    @FXML
    private TextField txt21;

    @FXML
    private TextField txt22;
    @FXML
    private RadioButton opt4;

    @FXML
    private RadioButton opt5;

    @FXML
    private RadioButton opt6;

    @FXML
    private TextField txt25;

    @FXML
    private TextField txt26;

    @FXML
    private TextField txt27;

    @FXML
    private TextField txt28;

    @FXML
    private TextField txt29;

    @FXML
    private TextField txt23;

    @FXML
    private TextField txt24;
    @FXML
    private TextField txt30;
    @FXML
    private TextField txt31;

    @FXML
    private TextField txt32;

    @FXML
    private Button ok5;

    @FXML
    private RadioButton opt7;
  
    @FXML
    private Button ok21;
    

    @FXML
    private ToggleGroup optproducto;
    @FXML
    private Button actu;

    @FXML
    private Button buscar;

    @FXML
    private Button delete;
    @FXML
    private TextField direc_tienda;

    @FXML
    private TextArea fechafactura;

    @FXML
    private TextField form_pago;

    @FXML
    private TextField ger_tienda;

    @FXML
    private TextField nom_cliente;

    @FXML
    private TextField nom_tienda;
    @FXML
    private TextField punt_cliente;
    @FXML
    private TextField teltienda;
    @FXML
    private TextField txt100;
    @FXML
    private Button cpr;
    @FXML
    private Button CP;
    @FXML
    private TextField txtidcliente;

    @FXML
    private TextField txtnit;
    
    @FXML
    private TextArea txtproductos;
    
    
    @FXML
    private TextArea If;
    @FXML
    private ToggleGroup optpago;
    @FXML
    private Button actua2;
    @FXML
    private TableColumn<Producto1, String> c;

    @FXML
    private TableColumn<Producto1, Double> ca;
    
    @FXML
    private TableColumn<Producto1, Integer> i;

    @FXML
    private TableColumn<Producto1, String> n;
    @FXML
    private TableColumn<Producto1, Double> p;
    @FXML
    private TableView<Producto1> tbl1;
    @FXML
    private TableColumn<Producto1, String> t;


    @FXML
    private Button actua3;
     Connection conexiion = null;
   
    PreparedStatement preparesStatement = null;
   
    ResultSet resultSet = null;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
    @FXML
    void save1(ActionEvent event) {
    	conexiion = conexion.conectar();
    	try {
    		preparesStatement = conexiion
    				.prepareStatement("Insert into Tienda (nit, nombre, direccion, gerente, telefono ) values (?,?,?,?,?)");
			preparesStatement.setString(1,txt2.getText());
			preparesStatement.setString(2,txt19.getText());
			preparesStatement.setString(3,txt1.getText());
			preparesStatement.setString(4,txt3.getText());
			preparesStatement.setString(5,txt4.getText());
			
			int resultado = preparesStatement.executeUpdate();
			if(resultado>0) {
				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
				
				conexiion.close();
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
		}
    	

    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
	
    @FXML
    void save2(ActionEvent event) {
    	conexiion = conexion.conectar();
    	
    	
    	try {
    		preparesStatement = conexiion
    				.prepareStatement("Insert into Factura (numero, fecha, nit ) values (?,?,?)");
			preparesStatement.setString(1,txt31.getText());
			preparesStatement.setString(2,date1.getValue().toString());
			preparesStatement.setString(3,txt2.getText());
			
			
					
			int resultado = preparesStatement.executeUpdate();
			if(resultado>0) {
				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
				
				conexiion.close();
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
		}
    	
 

    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
    @FXML

    void save3(ActionEvent event) {
	
    	 
    	  
		
	if (opt1.isSelected()) {
		
		conexiion = conexion.conectar();
    	try {
    		preparesStatement = conexiion
    				.prepareStatement("Insert into Producto (codigo, cantidad, nombre, precio, impuesto, tipo, nit, idConsumidor ) values (?,?,?,?,?,?,?,? )");
			preparesStatement.setString(1,tex9.getText());
			preparesStatement.setString(2,tex11.getText());
			preparesStatement.setString(3,tex8.getText());
			preparesStatement.setString(4,tex10.getText());
			preparesStatement.setString(5,tex12.getText());
			preparesStatement.setString(6,"Alimento");
			preparesStatement.setString(7,txt2.getText());
			preparesStatement.setString(8,tex6.getText());
			
			int resultado = preparesStatement.executeUpdate();
			if(resultado>0) {
				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
				limpiarPrimerFormulario();
				conexiion.close();
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
		}
    	
		
	}
	else if(opt2.isSelected()) {
		
		conexiion = conexion.conectar();
    	try {
    		preparesStatement = conexiion
    				.prepareStatement("Insert into Producto (codigo, cantidad, nombre, precio, impuesto, tipo, nit, idConsumidor ) values (?,?,?,?,?,?,?,? )");
			preparesStatement.setString(1,tex9.getText());
			preparesStatement.setString(2,tex11.getText());
			preparesStatement.setString(3,tex8.getText());
			preparesStatement.setString(4,tex10.getText());
			preparesStatement.setString(5,tex12.getText());
			preparesStatement.setString(6,"Aseo");
			preparesStatement.setString(7,txt2.getText());
			preparesStatement.setString(8,tex6.getText());
			
			int resultado = preparesStatement.executeUpdate();
			if(resultado>0) {
				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
				limpiarPrimerFormulario();
				conexiion.close();
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
		}
    	
		
	}
	else {
		conexiion = conexion.conectar();
    	try {
    		preparesStatement = conexiion
    				.prepareStatement("Insert into Producto (codigo, cantidad, nombre, precio, impuesto, tipo, nit, idConsumidor ) values (?,?,?,?,?,?,?,? )");
			preparesStatement.setString(1,tex9.getText());
			preparesStatement.setString(2,tex11.getText());
			preparesStatement.setString(3,tex8.getText());
			preparesStatement.setString(4,tex10.getText());
			preparesStatement.setString(5,tex12.getText());
			preparesStatement.setString(6,"Electronico");
			preparesStatement.setString(7,txt2.getText());
			preparesStatement.setString(8,tex6.getText());
			
			int resultado = preparesStatement.executeUpdate();
			if(resultado>0) {
				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
				limpiarPrimerFormulario();
				conexiion.close();
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
		}
    	
		
	
	}
	
	
	
	
	
	
    }
    private void limpiarPrimerFormulario() {
		
    	tex9.setText(null);
		tex11.setText(null);
		tex8.setText(null);
		tex10.setText(null);
		tex12.setText(null);
		
    	
	}
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @FXML
    void save4(ActionEvent event) {
    	
    	
    	if (opt4.isSelected()) {
    		conexiion = conexion.conectar();
        	
        	
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("Insert into Pago (idRegistroDePago, tipo, numero ) values (?,?,?)");
    			preparesStatement.setString(1,txt31.getText());
    			preparesStatement.setString(2,"Targeta");
    			preparesStatement.setString(3,txt31.getText());
    			
    			
    					
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
    				
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
    			}
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}
        	
			
		
			
		}
    	else if (opt5.isSelected()) {
conexiion = conexion.conectar();
        	
        	
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("Insert into Pago (idRegistroDePago, tipo, numero ) values (?,?,?)");
    			preparesStatement.setString(1,txt31.getText());
    			preparesStatement.setString(2,"Efectivo");
    			preparesStatement.setString(3,txt31.getText());
    			
    			
    					
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
    				
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
    			}
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}
			
			 
			
		}
    	else {
conexiion = conexion.conectar();
        	
        	
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("Insert into Pago (idRegistroDePago, tipo, numero ) values (?,?,?)");
    			preparesStatement.setString(1,txt31.getText());
    			preparesStatement.setString(2,"Cheque");
    			preparesStatement.setString(3,txt31.getText());
    			
    			
    					
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
    			}
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}
			
			 
			
		}
    

    }
   
    
       @FXML
    void save5(ActionEvent event) {
    	   conexiion = conexion.conectar();
       	try {
       		preparesStatement = conexiion
       				.prepareStatement("Insert into Consumidor (nombrec, idConsumidor, numero ) values (?,?,?)");
   			preparesStatement.setString(1,tex13.getText());
   			preparesStatement.setString(2,tex6.getText());
   			preparesStatement.setString(3,txt31.getText());
   		
   			
   			
   			int resultado = preparesStatement.executeUpdate();
   			if(resultado>0) {
   				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
   				
   				conexiion.close();
   			}else {
   				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
   			}
   		} catch (Exception e) {
   			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
   		}
    	  
    }

       @FXML
       void actualizar(ActionEvent event) {
    	   conexiion = conexion.conectar();
          	try {
          		preparesStatement = conexiion
          				.prepareStatement("UPDATE Consumidor SET nombrec = ? where numero =?");
      			preparesStatement.setString(1,nom_cliente.getText());
      			preparesStatement.setString(2,txt100.getText());
      			
      		
      			
      			
      			int resultado = preparesStatement.executeUpdate();
      			if(resultado>0) {
      				JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
      				
      				conexiion.close();
      			}else {
      				JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro.");
      			}
      		} catch (Exception e) {
      			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
      		}
       }

       @FXML
       void buscar(ActionEvent event) {
    	   conexiion = conexion.conectar();
          	try {
          		preparesStatement = conexiion
          				.prepareStatement("select  t.nombre, t.direccion, t.telefono, t.gerente, t.nit from proyectobd.factura f inner join proyectobd.tienda t on f.nit=t.nit where f.numero = ?");
      			preparesStatement.setString(1,txt100.getText());
      			resultSet = preparesStatement.executeQuery();
      			if (resultSet.next()) {
      				
      				nom_tienda.setText(resultSet.getString("t.nombre"));
      				direc_tienda.setText(resultSet.getString("t.direccion"));
      				teltienda.setText(resultSet.getString("t.telefono"));
      				ger_tienda.setText(resultSet.getString("t.gerente"));
      				txtnit.setText(resultSet.getString("t.nit"));
				}else {
					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
				}
      			
      			conexiion.close();
      			
      			
      		} catch (Exception e) {
      			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
      		}
       }

       @FXML
       void consultacp(ActionEvent event) {
    	   conexiion = conexion.conectar();
         	try {
         		preparesStatement = conexiion
         				.prepareStatement("select  f.fecha, p.tipo, c.nombrec, c.idConsumidor from proyectobd.factura f inner join proyectobd.pago p on f.numero=p.numero inner join proyectobd.consumidor c on f.numero= c.numero where f.numero = ?");
     			preparesStatement.setString(1,txt100.getText());
     			resultSet = preparesStatement.executeQuery();
     			if (resultSet.next()) {
     				fechafactura.setText(resultSet.getString("f.fecha"));
     				form_pago.setText(resultSet.getString("p.tipo"));
     				nom_cliente.setText(resultSet.getString("c.nombrec"));
     				txtidcliente.setText(resultSet.getString("c.idConsumidor"));
     				
				}else {
					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
				}
     			
     			conexiion.close();
     			
     			
     		} catch (Exception e) {
     			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
     		}

       }

       @FXML
       void consultapr(ActionEvent event) {
    	   conexiion = conexion.conectar();
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("select p.nombre , p.cantidad, p.codigo, p.precio,p.tipo from proyectobd.producto p inner join proyectobd.consumidor c on p.idConsumidor=c.idConsumidor inner join proyectobd.factura f on c.numero= f.numero where f.numero = ?");
    			preparesStatement.setString(1,txt100.getText());
    			resultSet = preparesStatement.executeQuery();
    			if (resultSet.next()) {
    				txtproductos.setText("NOMBRE: " +resultSet.getString("f.fecha")+ "; CANTIDAD: "+ resultSet.getString("p.cantidad")+"; CODIGO: "+resultSet.getString("p.codigo")+ "; PRECIO: "+ resultSet.getString("p.precio")+"; TIPO: "+resultSet.getString("p.tipo"));
    				
				}else {
					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
				}
    			
    			conexiion.close();
    			
    			
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}

      }
       @FXML
       void actualizarpago(ActionEvent event) {
    	   conexiion = conexion.conectar();
         	try {
         		preparesStatement = conexiion
         				.prepareStatement("UPDATE Pago SET tipo = ? where numero =?");
     			preparesStatement.setString(1,form_pago.getText());
     			preparesStatement.setString(2,txt100.getText());
     			
     		
     			
     			
     			int resultado = preparesStatement.executeUpdate();
     			if(resultado>0) {
     				JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
     				
     				conexiion.close();
     			}else {
     				JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro.");
     			}
     		} catch (Exception e) {
     			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
     		}

       }

       @FXML
       void actualizartienda(ActionEvent event) {
    	   conexiion = conexion.conectar();
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("UPDATE Tienda SET nombre = ?, direccion = ?, gerente = ?, telefono = ?   where nit =?");
    			
    			preparesStatement.setString(1,nom_tienda.getText());
    			preparesStatement.setString(2,direc_tienda.getText());
    			preparesStatement.setString(3,ger_tienda.getText());
    			preparesStatement.setString(4,teltienda.getText());
    			preparesStatement.setString(5,txtnit.getText());
    			
    		
    			
    			
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
    				
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro.");
    			}
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}

       }
       

       @FXML
       void eliminar(ActionEvent event) {
    	  
       }
  
       

    @FXML
    void initialize() {
    	
    }

	
ObservableList<Producto1> listM;
int index= -1;
Connection conn=null;
ResultSet rs= null;
PreparedStatement pst=null;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		n.setCellValueFactory(new PropertyValueFactory<Producto1, String>("nombre"));
		c.setCellValueFactory(new PropertyValueFactory<Producto1, String>("codigo"));
		ca.setCellValueFactory(new PropertyValueFactory<Producto1, Double>("cantidad"));
		p.setCellValueFactory(new PropertyValueFactory<Producto1, Double>("precio"));
		i.setCellValueFactory(new PropertyValueFactory<Producto1, Integer>("impuesto"));
		t.setCellValueFactory(new PropertyValueFactory<Producto1, String>("tipo"));
		
		listM = conexion.getDataProducto();
		tbl1.setItems(listM);
	}

    

    
}
