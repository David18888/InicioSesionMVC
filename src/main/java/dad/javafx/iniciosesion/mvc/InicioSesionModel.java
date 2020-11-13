package dad.javafx.iniciosesion.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InicioSesionModel {

	
private StringProperty user= new SimpleStringProperty();
private StringProperty password= new SimpleStringProperty();


public final StringProperty userProperty() {
	return this.user;
}

public final String getUser() {
	return this.userProperty().get();
}


public final StringProperty passwordProperty() {
	return this.password;
}

public final String getPassword() {
	return this.passwordProperty().get();
}

public final void setPassword(final String password) {
	this.passwordProperty().set(password);
}

}










	
	
	

