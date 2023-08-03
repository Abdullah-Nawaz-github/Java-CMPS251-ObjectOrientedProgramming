package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			System.out.println("running");
			String viewFileName = "TriangleView.fxml";
			String windowTite = "Triangle Calculator";
			Parent root = FXMLLoader.load(getClass().getResource(viewFileName));
			stage.setTitle(windowTite);
			stage.setScene(new Scene(root, 800, 500));

			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
