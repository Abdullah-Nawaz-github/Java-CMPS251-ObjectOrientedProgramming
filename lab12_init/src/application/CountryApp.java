package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CountryApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane root = FXMLLoader.load(getClass().getResource("CountryView.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("Country App");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
