package gui;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class StartClass extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		URL fxmlURL = new URL("file:resources/WindowLayout.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlURL);
		@SuppressWarnings("static-access")
		Parent root = loader.load(new URL("file:resources/WindowLayout.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("File Differences");
		primaryStage.show();
	}

	public static void main(String[] args) throws Exception {
		launch();
	}

	
}
