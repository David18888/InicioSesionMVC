package dad.javafx.iniciosesion.mvc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import org.apache.commons.codec.digest.DigestUtils;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class InicioSesionController {

	private InicioSesionModel model= new InicioSesionModel();
	private  InicioSesionView view= new InicioSesionView();
	
	public InicioSesionModel getModel() {
		return model;
	}
	
	public InicioSesionView getView() {
		return view;
	}
	
	
	public InicioSesionController() throws IOException{
		
		view.getAceptarButton().setOnAction(e->onAceptarButtonAction());
		view.getCancelarButton().setOnAction(e-> Platform.exit());
	
		
		
		//Bindeos
		model.userProperty().bindBidirectional(view.getUserText().textProperty());
		model.passwordProperty().bindBidirectional(view.getPasswordText().textProperty());
		
		
		
		
		
		
		
		
	}

	private void onAceptarButtonAction()  {
		String user =  model.getUser();
		String password = model.getPassword();
		
		if(user.isEmpty() || password.isEmpty() || checkUser(user, password)==false) {
		
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ACCESO INCORRECTO");
			alert.setHeaderText(null);
			alert.setContentText("El usuario o contraseña introducidos no son correctos");
			alert.showAndWait();
		
			
		
			
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ACCESO PERMITIDO");
			alert.setHeaderText(null);
			alert.setContentText("El acceso ha sido correcto");
			alert.showAndWait();
			
			Platform.exit();
			
		
			}
		}
		
		

		
		
	private boolean checkUser(String user, String password) {
		File archivo= new File("users.csv");
		FileReader fr;
		BufferedReader br;
	try {
			
			 fr = new FileReader(archivo);
			 br = new BufferedReader(fr);
			 String creedenciales;
			 while( (creedenciales = br.readLine()) != null ) {
				
				 String[] datos = creedenciales.split(",");
				 
				 if( user.equals(datos[0])  && DigestUtils.md5Hex(password).toUpperCase().equals(datos[1])) {
					 br.close();
					 return true;
					 
			 } 

			 }
	} catch(Exception e) {}
	
	return false;
	
		
	}	
	
		
	

			
			
			
		
		
		
}
		
		
		
	
	
	
	
	

