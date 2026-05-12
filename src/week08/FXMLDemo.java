package week08;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLDemo extends Application{
	public void start(Stage primaryStage) throws IOException {		
		// create a node
		// "Location is not set."
		FXMLLoader loader = new FXMLLoader(getClass().getResource("example.fxml"));
		Parent pane = loader.load();
	
		// create a scene
		Scene scene = new Scene(pane);
				
		// add the scene to stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Sign up!");
		// show stage
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
