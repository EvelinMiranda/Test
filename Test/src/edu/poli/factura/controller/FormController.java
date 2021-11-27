package edu.poli.factura.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import edu.poli.factura.model.Cliente;
import edu.poli.factura.model.Factura;
import edu.poli.factura.model.Producto;
import edu.poli.factura.model.Tienda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class FormController {

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
    private Button limpiar1;
    @FXML
    private TextArea txtipo;
    @FXML
    private Button verp;
    @FXML
    private Button Limpiarpr;
    @FXML
    private Button consulta_consumidor;
    @FXML
    private ComboBox<String> list1;
    @FXML
    private Button consulta_consumidor1;
    @FXML
    private TextArea cl1;
    @FXML
    private TextField txtcl;
    @FXML
    private TextArea inftienda;
    @FXML
    private Button consulta_precio;
    @FXML
    private TextField txtprecio;
    @FXML
    private TextField txtcantidad;
    @FXML
    private TextField txtId;
    @FXML
    private Button IdProducto;
    @FXML
    private Button consulta_tipo;

    @FXML
    private TextField txtTipo;
    @FXML
    private Button genFactura;
    @FXML
    private TextArea txtFactura;

    @FXML
    private Button eliminarf;

    @FXML
    private Button actua3;
    @FXML
    private TextField txt311;
    
    @FXML
    private TextField txtcl1;
    @FXML
    private ComboBox<String> list2;
    @FXML
    private Button buscaf;
    @FXML
    private TextField fech;
    @FXML
    private Button refr;
    @FXML
    private Button totalap;
    @FXML
    private TextField totaltxt;
 
    
      Connection conexiion = null;
   
    PreparedStatement preparesStatement = null;
   
    ResultSet resultSet = null;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Tienda t= new Tienda();
    Cliente c= new Cliente();
    
    
    @FXML
    /*Este metodo inserta la tienda en base de datos*/
    void save1(ActionEvent event) {
    	
    	conexiion = conexion.conectar();
    	try {
    		preparesStatement = conexiion
    				.prepareStatement("Insert into tienda (nit, nombre, direccion, gerente, telefono ) values (?,?,?,?,?)");
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
    @FXML
    /*Este metodo consulta la tienda*/
    void buscar(ActionEvent event) {
 	   
 	   conexiion = conexion.conectar();
       	try {
       		preparesStatement = conexiion
       				.prepareStatement("select  tienda.nombre, tienda.direccion, tienda.telefono, tienda.gerente from tienda where tienda.nit= ?");
   			preparesStatement.setString(1,txt2.getText());
   			resultSet = preparesStatement.executeQuery();
   			if (resultSet.next()) {
   				
   				txt19.setText(resultSet.getString("tienda.nombre"));
   				txt1.setText(resultSet.getString("tienda.direccion"));
   				txt3.setText(resultSet.getString("tienda.gerente"));
   				txt4.setText(resultSet.getString("tienda.telefono"));
   				
   				
   				
				}else {
					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
				}
   			
   			conexiion.close();
   			
   			
   		} catch (Exception e) {
   			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
   		}
   		
    }

    /*Este metodo modifica la informacion de alguna tienda*/
    @FXML
    void actualizartienda(ActionEvent event) {
 	   
 	   conexiion = conexion.conectar();
     	try {
     		preparesStatement = conexiion
     				.prepareStatement("UPDATE Tienda SET nombre = ?, direccion = ?, gerente = ?, telefono = ?   where nit =?");
 			
 			preparesStatement.setString(1,txt19.getText());
 			preparesStatement.setString(2,txt1.getText());
 			preparesStatement.setString(3,txt3.getText());
 			preparesStatement.setString(4,txt4.getText());
 			preparesStatement.setString(5,txt2.getText());
 			
 		
 			
 			
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
    /*Este metodo limpia el formilario de la tienda*/
    @FXML
    void limpiart(ActionEvent event) {
    	 txt19.setText(null);
    	 txt1.setText(null);
    	 txt3.setText(null);
    	 txt4.setText(null);
    	 txt2.setText(null);
    }

    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
	
   
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /*este metodo inserta el producto a la base de datos*/
    public ArrayList<Producto> producto;
    @FXML

    void save3(ActionEvent event) {
	
    	 
		
		conexiion = conexion.conectar();
    	try {
    		if(opt1.isSelected()) {
    			preparesStatement = conexiion
        				
        				.prepareStatement("Insert into Producto (id_producto,  nombre, precio,  tipo, nit) values (?,?,?,?,? )");
    			preparesStatement.setString(1,tex9.getText());
    	
    			preparesStatement.setString(2,tex8.getText());
    			preparesStatement.setString(3,tex10.getText());
    		
    			preparesStatement.setString(4,"Alimento");
    			preparesStatement.setString(5,txt2.getText());
    			
    			
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
    				//list1.getItems().add(tex8.getText());
    				limpiarPrimerFormulario();
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
    			}
    		}
    		else if (opt2.isSelected()) {
    						preparesStatement = conexiion
        				
        				.prepareStatement("Insert into Producto (id_producto,  nombre, precio,  tipo, nit) values (?,?,?,?,? )");
    			preparesStatement.setString(1,tex9.getText());
    			
    			preparesStatement.setString(2,tex8.getText());
    			preparesStatement.setString(3,tex10.getText());
    			
    			preparesStatement.setString(4,"Aseo");
    			preparesStatement.setString(5,txt2.getText());
    			
    			
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
    				//list1.getItems().add(tex8.getText());
    				limpiarPrimerFormulario();
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
    			}
				
			}
    		else {
                      	preparesStatement = conexiion
        				
        				.prepareStatement("Insert into Producto (id_producto,  nombre, precio,  tipo, nit) values (?,?,?,?,? )");
    			preparesStatement.setString(1,tex9.getText());
    			
    			preparesStatement.setString(2,tex8.getText());
    			preparesStatement.setString(3,tex10.getText());
    			
    			preparesStatement.setString(4,"Electronico");
    			preparesStatement.setString(5,txt2.getText());
    			
    			
    			int resultado = preparesStatement.executeUpdate();
    			if(resultado>0) {
    				JOptionPane.showMessageDialog(null, "Registro agregado correctamente.");
    				//list1.getItems().add(tex8.getText());
    				limpiarPrimerFormulario();
    				conexiion.close();
    			}else {
    				JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.");
    			}
			}
    	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
		}
    	
    
    }
    /*este metodo consulta el producto a la base de datos*/
    @FXML
    void consultapr(ActionEvent event) {
    	 conexiion = conexion.conectar();
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("select producto.nombre, producto.precio, producto.tipo from producto where producto.Id_producto = ?");
    			preparesStatement.setString(1,tex9.getText());
    			resultSet = preparesStatement.executeQuery();
    			if (resultSet.next()) {
    				
    				tex8.setText(resultSet.getString("producto.nombre"));
    				tex10.setText(resultSet.getString("producto.precio"));
    				txtipo.setText(resultSet.getString("producto.tipo"));
    				
 				}else {
 					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
 				}
    			
    			conexiion.close();
    			
    			
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}
    		
   }
    /*este metodo limpia el formulario*/
    @FXML
    void Limpiarpr(ActionEvent event) {
    	limpiarPrimerFormulario();

    }
    private void limpiarPrimerFormulario() {
		
   	 tex9.setText(null);
   	 tex8.setText(null);
   	 tex10.setText(null);
   	 
       	
   	}
   
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   
    public ArrayList<Cliente> cliente;
    
       @FXML
    void save5(ActionEvent event) {
    	  
    	   conexiion = conexion.conectar();
       	try {
       		preparesStatement = conexiion
       				.prepareStatement("Insert into Consumidor (nombre, No_documento) values (?,?)");
   			preparesStatement.setString(1,tex13.getText());
   			preparesStatement.setString(2,tex6.getText());
   			
   		
   			
   			
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
          				.prepareStatement("UPDATE Consumidor SET nombre = ? where No_documento =?");
      			preparesStatement.setString(1,tex13.getText());
      			preparesStatement.setString(2,tex6.getText());
      			
      		
      			
      			
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
/////////////////////////////////////
     
       @FXML
       void consulta_consumidor(ActionEvent event) {
    	   conexiion = conexion.conectar();
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("SELECT consumidor.nombre FROM consumidor where consumidor.No_documento= ?");
    			preparesStatement.setString(1,tex6.getText());
    			resultSet = preparesStatement.executeQuery();
    			if (resultSet.next()) {
    				
    				tex13.setText(resultSet.getString("consumidor.nombre"));
    				
       		    	
    				
				}else {
					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
				}
    			
    			conexiion.close();
    			
    			
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}

       }
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////
      
       @FXML
       void verproductos(ActionEvent event) {
    	   conexiion = conexion.conectar();
       	try {
       		preparesStatement = conexiion
       				.prepareStatement("select producto.nombre from producto where producto.nit= ?");
   			preparesStatement.setString(1,txt2.getText());
   			resultSet = preparesStatement.executeQuery();
   			if (resultSet.next()) {
   				while (resultSet.next()) {
					
   					list1.getItems().add(resultSet.getString("producto.nombre"));
				}
   			
   				
			
   				
   				
   				
				}else {
					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
				}
   			
   			conexiion.close();
   			
   			
   		} catch (Exception e) {
   			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
   		}


       }
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          @FXML
       void consultacn(ActionEvent event) {
        	  conexiion = conexion.conectar();
          	try {
          		preparesStatement = conexiion
          				.prepareStatement("SELECT consumidor.nombre FROM consumidor where consumidor.No_documento= ?");
      			preparesStatement.setString(1,txtcl.getText());
      			resultSet = preparesStatement.executeQuery();
      			if (resultSet.next()) {
      				
      				cl1.setText(resultSet.getString("consumidor.nombre"));
      				t.setDireccion(txt1.getText());
    		    	t.setNit(txt2.getText());
    		    	t.setGerente(txt3.getText());
    		    	t.setTelefono(Integer.parseInt(txt4.getText()));
    		    	t.setNombre(txt19.getText());
    				
    		    	c.setNo_documento(Integer.parseInt(txtcl.getText()));
    		    	c.setNombre(cl1.getText());
    			
    		    	productos= new ArrayList<>();
      				
  				}else {
  					JOptionPane.showMessageDialog(null, "Cliente no registrado");
  				}
      			
      			conexiion.close();
      			
      			
      		} catch (Exception e) {
      			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
      		}
          	inftienda.setText(txt19.getText()+" "+"-"+" "+ txt1.getText());
          	System.out.println(t);
	    	System.out.println(c);

       }

     
   
       
       public ArrayList<Producto> productos;
       @FXML
       void save2(ActionEvent event) {
    		
       	conexiion = conexion.conectar();
       	
       	
       	try {
       		preparesStatement = conexiion
       				.prepareStatement("Insert into Factura (id_factura, fecha, cantidad, precio, nit, No_documento, Id_producto) values (?,?,?,?,?,?,?)");
   			preparesStatement.setString(1,txt31.getText());
   			preparesStatement.setString(2,date1.getValue().toString());
   			preparesStatement.setString(3,txtcantidad.getText());
   			preparesStatement.setString(4,txtprecio.getText());
   			preparesStatement.setString(5,txt2.getText());
   			preparesStatement.setString(6,txtcl.getText());
   			preparesStatement.setString(7,txtId.getText());
   			
   			
   			Producto p= new Producto(txtId.getText(),list1.getValue(),Double.parseDouble(txtprecio.getText()),txtTipo.getText(), txtcantidad.getText() );
   			
   		
   			productos.add(p);
   			System.out.println(p);
   					
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
       void c_t(ActionEvent event) {
    	   conexiion = conexion.conectar();
        	try {
        		preparesStatement = conexiion
        				.prepareStatement("select producto.tipo from producto where nombre = ?");
    			preparesStatement.setString(1,list1.getValue());
    			resultSet = preparesStatement.executeQuery();
    			if (resultSet.next()) {
    				
    				txtTipo.setText(resultSet.getString("producto.tipo"));
    			    
    			     
    				
    				
    				
 				}else {
 					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
 				}
    			
    			conexiion.close();
    			
    			
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}
    		


       }
       
       @FXML
       void IdProduct(ActionEvent event) {
    	   conexiion = conexion.conectar();
         	try {
         		preparesStatement = conexiion
         				.prepareStatement("select producto.Id_producto from producto where nombre = ?");
     			preparesStatement.setString(1,list1.getValue());
     			resultSet = preparesStatement.executeQuery();
     			if (resultSet.next()) {
     				
     				txtId.setText(resultSet.getString("producto.Id_producto"));
     			    
     			     
     				
     				
     				
  				}else {
  					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
  				}
     			
     			conexiion.close();
     			
     			
     		} catch (Exception e) {
     			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
     		}
     		

       }
       @FXML
       void c_p(ActionEvent event) {
    	   conexiion = conexion.conectar();
          	try {
          		preparesStatement = conexiion
          				.prepareStatement("select producto.precio from producto where nombre = ?");
      			preparesStatement.setString(1,list1.getValue());
      			resultSet = preparesStatement.executeQuery();
      			if (resultSet.next()) {
      				
      				txtprecio.setText(resultSet.getString("producto.precio"));
      			    
      			     
      				
      				
      				
   				}else {
   					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
   				}
      			
      			conexiion.close();
      			
      			
      		} catch (Exception e) {
      			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
      		}
      		

       }
   
       
      
       
       @FXML
       void generarFactura(ActionEvent event) {
    	   Factura f= new Factura(txt31.getText(), date1.getValue().toString(),t,c, productos);
    	   txtFactura.setText(f.toString()+"\n "+"TOTAL A PAGAR: "+ totaltxt.getText());

       }
       @FXML
       void buscafactura(ActionEvent event) {
    	   conexiion = conexion.conectar();
          	try {
          		preparesStatement = conexiion
          				.prepareStatement("SELECT   f.fecha, f.No_documento, f.precio FROM factura f, producto p, consumidor c   where  c.No_documento=f.No_documento  and p.Id_producto=f.Id_producto and id_factura =  ?");
      			preparesStatement.setString(1,txt311.getText());
      			resultSet = preparesStatement.executeQuery();
      			if (resultSet.next()) {
      				txtcl1.setText(resultSet.getString("f.No_documento"));
      				fech.setText(resultSet.getString("f.fecha"));
      				
   			
      				
      				
      				
   				}else {
   					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
   				}
      			
      			conexiion.close();
      			
      			
      		} catch (Exception e) {
      			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
      		}



       }
       @FXML
       void eliminarFactura(ActionEvent event) {
    	   conexiion = conexion.conectar();
         	try {
         		preparesStatement = conexiion
         				.prepareStatement("delete from factura f  where f.id_factura = ? and f.No_documento = ?");
     			preparesStatement.setString(1,txt311.getText());
     			preparesStatement.setString(2,txtcl1.getText());
     			int resultado = preparesStatement.executeUpdate();
     			if (resultado > 0) {
     				JOptionPane.showMessageDialog(null, "Factura eliminada");
     				
     				
  				}else {
  					JOptionPane.showMessageDialog(null, "Factura no encontrada");
  				}
     			
     			conexiion.close();
     			
     			
     		} catch (Exception e) {
     			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
     		}


    	   

       }
       @FXML
       void refresh(ActionEvent event) {
    	   conexiion = conexion.conectar();
        	try {
        		preparesStatement = conexiion
        				.prepareCall("{call ValIva}");
    			
    			resultSet = preparesStatement.executeQuery();
    			if (resultSet.next()) {
    				System.out.println(resultSet.getString(0));
    				
 			
    				
    				
    				
 				}else {
 					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
 				}
    			
    			conexiion.close();
    			
    			
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
    		}

   	   
     		

       }
       @FXML
       void total(ActionEvent event) {
    	   conexiion = conexion.conectar();
         	try {
         		preparesStatement = conexiion
         				.prepareStatement("SELECT sum(Valor_Prod_IVA) as total FROM new_schema.factura where id_factura =   ?");
     			preparesStatement.setString(1,txt31.getText());
     			resultSet = preparesStatement.executeQuery();
     			if (resultSet.next()) {
     				totaltxt.setText(resultSet.getString("total"));
     				
     				
  			
     				
     				
     				
  				}else {
  					JOptionPane.showMessageDialog(null, "Codigo de factura no encontrado");
  				}
     			
     			conexiion.close();
     			
     			
     		} catch (Exception e) {
     			JOptionPane.showMessageDialog(null, "Error de acceso a la Base de Datos.");
     		}


       }
      

    @FXML
    void initialize() {
    	
    }

	


    

    
}
