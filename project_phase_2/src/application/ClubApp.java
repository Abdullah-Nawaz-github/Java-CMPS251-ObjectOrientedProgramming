package application;

import java.net.URL;
import java.util.Iterator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 01/03/2023
 * 
 * Main Class that starts the entire ClubApp.
 * 
 */
public class ClubApp extends Application {

	/**
	 * Method that opens the main window of appplication after loading fxml file adn
	 * setting title.
	 */
	@Override
	public void start(Stage Primarystage) {

		try {
			System.out.println("running main window");
			// use URL to get files in other packages
			URL url = getClass().getResource("/application/view/MainView.fxml");
			Parent root;
			Scene scene;
			root = FXMLLoader.load(url);
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Primarystage.setScene(scene);
			//set title of the stage
			Primarystage.setTitle("Club Registration App");
			Primarystage.setResizable(false);
			Primarystage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args Main method of class used to call the method which will launch
	 *             the main window
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
