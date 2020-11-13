package dad.javafx.iniciosesion.main;

import dad.javafx.iniciosesion.mvc.InicioSesionController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		InicioSesionController controller= new InicioSesionController();
		
		
		Scene scene= new Scene(controller.getView(),400,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Inicio Sesión MVC");
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		
		launch(args);
	}

}
