package dad.javafx.iniciosesion.mvc;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InicioSesionView extends VBox{
	
	private Label userLabel;
	private Label passwordLabel;
	private TextField userText;
	private PasswordField passwordText;
	private Button aceptarButton;
	private Button cancelarButton;
	
	
	
	
public InicioSesionView(){
	super();
	
	userLabel= new Label("Usuario: ");
	userLabel.setPrefWidth(80);
	
	passwordLabel= new Label("Contraseña: ");
	passwordLabel.setPrefWidth(80);
	
	userText= new TextField();
userText.setPrefColumnCount(10);
	passwordText= new PasswordField();
	passwordText.setPrefColumnCount(10);

	
	aceptarButton= new Button("Aceptar");
	cancelarButton= new Button("Cancelar");
	
	HBox userBox= new HBox(5,userLabel,userText);
	userBox.setAlignment(Pos.BASELINE_CENTER);
	HBox passwordBox= new HBox(5,passwordLabel,passwordText);
	passwordBox.setAlignment(Pos.BASELINE_CENTER);
	HBox buttonsBox = new HBox(5,aceptarButton, cancelarButton);
	
	aceptarButton.setDefaultButton(true);

	
	
	
	getChildren().addAll(userBox,passwordBox,buttonsBox);
	setAlignment(Pos.CENTER);
	setFillWidth(false);
	setSpacing(10);
	
}




public Label getUserLabel() {
	return userLabel;
}




public Label getPasswordLabel() {
	return passwordLabel;
}




public TextField getUserText() {
	return userText;
}




public PasswordField getPasswordText() {
	return passwordText;
}




public Button getAceptarButton() {
	return aceptarButton;
}




public Button getCancelarButton() {
	return cancelarButton;
}
	
	
	
	
	
	


}
