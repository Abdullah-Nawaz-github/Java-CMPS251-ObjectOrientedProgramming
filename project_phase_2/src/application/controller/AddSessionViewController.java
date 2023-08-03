package application.controller;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

import application.model.ClubAppRepository;
import application.model.Coach;
import application.model.Session;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * @author Sarim Toqeer - 202008545
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class used to control AddSessionView.fxml which is used for adding
 *       and updating Sessions.
 * 
 */
public class AddSessionViewController implements Initializable {
	/**
	 * ObservableList of type Coach which is used to display Coaches of session in tableview
	 * 
	 */
	private ObservableList<Coach> coachSessionOL = null;
	/**
	 *       Interface used to link main Sessions View with Session Editor 
	 */
	public interface AddSessionInteraction {
		/**
		 * @param Session
		 * 
		 *                 method that will be used in SessionViewController.java
		 *                 to save Session.
		 */
		public void saveSession(Session session);
	}
	/**
	 * @param interaction used to set interaction
	 */
	private AddSessionInteraction interaction;
	/**
	 * @param interaction used to set interaction
	 */
	public void setInteraction(AddSessionInteraction interaction) {
		this.interaction = interaction;
	}
	/**
	 * Contains data of Session that was removed from tableView when update
	 * Session process was being done. Use this data to add that Session back into
	 * the tableview if cancel button is pressed.
	 */
	Session previousSession;
	/**
	 * Button to cancel the process of adding Session 
	 */
	@FXML
	private Button cancelButton;
	/**
	 * DropDownList to choose the coach
	 */
	@FXML
	private ComboBox<Coach> coachCombo;
    /**
	 * date selector for end date
	 */
	@FXML
	private DatePicker endDP;
	/**
	 * Text Field for end time
	 */
	@FXML
	private TextField endTF;

	@FXML
	private Label memberEditLabel;
	/**
	 * Text Field for name
	 */
	@FXML
	private TextField nameTF;

	@FXML
	private Button okButton;
	/**
	 * Text Field for price
	 */
	@FXML
	private TextField priceTF;
    /**
	 * date selector for start date
	 */
	@FXML
	private DatePicker startDP;
	/**
	 * Text Field for start time
	 */
	@FXML
	private TextField startTF;
	/**
	 * Text Field for ID
	 */
	@FXML
	private TextField idTF;
	/**
	 * @param event closes current window and adds old sessions back if update
	 *              process is being done.
	 */
	@FXML
	void HandleCancelButton(ActionEvent event) {
		Stage stage = (Stage) endTF.getScene().getWindow();
		stage.close();
	}
	/**
	 * @param event creates new Session and sets attributes based on data entered
	 *              by the user. use interaction to save Session. Closes stage
	 */
	@FXML
	void HandleOKButton(ActionEvent event) {
		Session session = new Session();
		session.setSessionId(Integer.parseInt(idTF.getText()));
		session.setName(nameTF.getText());
		session.setPrice(Double.parseDouble(priceTF.getText()));
		session.setStartDate(startDP.getValue());
		session.setEndDate(endDP.getValue());
		String[] startTime = startTF.getText().split(":");
		session.setStartTime(LocalTime.of(Integer.parseInt(startTime[0]), Integer.parseInt(startTime[1]),
				Integer.parseInt(startTime[2])));
		String[] endTime = endTF.getText().split(":");
		session.setEndTime(
				LocalTime.of(Integer.parseInt(endTime[0]), Integer.parseInt(endTime[1]), Integer.parseInt(endTime[2])));
		session.setCoach(coachCombo.getValue());
		interaction.saveSession(session);
		HandleCancelButton(null);
	}
	/**
	 * method of interface Initializable. runs when window is launched.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		coachSessionOL = FXCollections.observableArrayList(ClubAppRepository.getCoaches());
		coachCombo.setItems(coachSessionOL);

	}

}
