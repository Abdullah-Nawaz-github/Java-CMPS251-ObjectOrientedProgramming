package application.controller;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Controller for MainView.fxml User choses to manipulate members or
 *       sessions in the Club
 *
 */
public class MainViewController {
	/**
	 * Javafx root
	 */
	Parent root;
	/**
	 * Javafx scene
	 */
	Scene scene;

	/**
	 * Button to launch member view
	 */
	@FXML
	private Button membersButton;

	/**
	 * Button to launch Session view
	 */
	@FXML
	private Button sessionsButton;

	/**
	 * @param event Runs when membersButton is clicked opens a window for
	 *              MemberView.fxml
	 */
	@FXML
	void HandleMembersButton(ActionEvent event) {
		try {
			System.out.println("running members");
			URL url = getClass().getResource("/application/view/MemberView.fxml");
			root = FXMLLoader.load(url);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Manipulate Members in Club");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	/**
	 * @param event Runs when sessionsButton is clicked opens a window for
	 *              SessionsView.fxml
	 */
	@FXML
	void HandleSessionsButton(ActionEvent event) {

		try {
			System.out.println("running sessions");
			URL url = getClass().getResource("/application/view/SessionsView.fxml");
			root = FXMLLoader.load(url);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Manipulate Sessions in Club");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
