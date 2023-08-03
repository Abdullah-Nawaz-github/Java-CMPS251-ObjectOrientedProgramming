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
 *       Class that controlls the MemberView.fxml Allows user to chose between
 *       manipulating Administrator, Coach, and Customer
 */
public class MemberViewController {

	/**
	 * Javafx root
	 */
	Parent root;
	/**
	 * Javafx scene
	 */
	Scene scene;

	/**
	 * Button to launch Administrator view
	 */
	@FXML
	private Button administratorsButton;

	/**
	 * Button to launch Coach view
	 */
	@FXML
	private Button coachsButton;

	/**
	 * Button to launch Customer view
	 */
	@FXML
	private Button customersButton;

	/**
	 * @param event Runs when administratorsButton is clicked opens a window for
	 *              AdministratorView.fxml
	 */
	@FXML
	void HandleAdministratorsButton(ActionEvent event) {
		try {
			System.out.println("running admins");
			URL url = getClass().getResource("/application/view/AdministratorView.fxml");
			root = FXMLLoader.load(url);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Manipulate Administrators in Club");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param event Runs when coachsButton is clicked opens a window for
	 *              CoachView.fxml
	 */
	@FXML
	void HandleCoachsButton(ActionEvent event) {
		try {
			System.out.println("running coaches");
			URL url = getClass().getResource("/application/view/CoachView.fxml");
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
	 * @param event Runs when customersButton is clicked opens a window for
	 *              MainCustomerView.fxml
	 */
	@FXML
	void HandleCustomersButton(ActionEvent event) {
		try {
			System.out.println("running customers");
			URL url = getClass().getResource("/application/view/MainCustomerView.fxml");
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
}
