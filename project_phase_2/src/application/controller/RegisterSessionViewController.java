package application.controller;

import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.ResourceBundle;

import application.model.ClubAppRepository;
import application.model.Coach;
import application.model.Customer;
import application.model.Session;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class used to controll RegisterSessionView.fxml which is used for
 *       adding and removing Customers from Session.
 * 
 */
public class RegisterSessionViewController implements Initializable {
	private ObservableList<Customer> CustomerSessionOL = null;

	/**
	 * @author Abdullah Nawaz 202108536
	 * @version 1.0
	 * @date 01/03/2023
	 * 
	 *       Interface used to link main Session View with Register Session Editor
	 *       (adding and removing Customers from Session)
	 *
	 */
	public interface RegisterSessionInteraction {
		/**
		 * @param session
		 * 
		 *                method that will be used in SessionViewController.java to save
		 *                session.
		 */
		public void saveSession(Session session);
	}

	private RegisterSessionInteraction interaction;

	/**
	 * @param interaction used to set interaction.
	 */
	public void setInteraction(RegisterSessionInteraction interaction) {
		this.interaction = interaction;
	}

	/**
	 * Contains data of Session that was removed from tableView when register
	 * Session process was being done. Use this data to add that Session back into
	 * the tableview if cancel button is pressed.
	 */
	Session previousSession;
	/**
	 * used to get name of coach and display it
	 */
	Coach coach;

	/**
	 * Contains customers that have already registered in this session. Will be used
	 * to not allow duplicate registrations and only show these customers when
	 * trying to unregsiter.
	 */
	ArrayList<Customer> previousCustomers = new ArrayList<>();

	/**
	 * Label for heading of window. changes to "Register" or "Unregister" depending
	 * on process
	 */
	@FXML
	private Label memberEditLabel;

	/**
	 * Button to add Session with the newly registered customer
	 */
	@FXML
	private Button okButton;

	/**
	 * Button to close current window and not register Customer
	 */
	@FXML
	private Button cancelButton;

	/**
	 * TextField for price
	 */
	@FXML
	private TextField priceTF;

	/**
	 * TextField for end Time
	 */
	@FXML
	private TextField endTF;

	/**
	 * TextField for name
	 */
	@FXML
	private TextField nameTF;

	/**
	 * Date Pricker for start Date
	 */
	@FXML
	private DatePicker startDP;

	/**
	 * TextField for start Time
	 */
	@FXML
	private TextField startTF;

	/**
	 * Date Pricker for end Date
	 */
	@FXML
	private DatePicker endDP;

	/**
	 * Combo Box with list of customers
	 */
	@FXML
	private ComboBox<Customer> CustomerDrop;

	/**
	 * Text Field with coachname
	 */
	@FXML
	private TextField CoachNameTF;

	/**
	 * Text Field with id
	 */
	@FXML
	private TextField IdTF;

	/**
	 * @param event runs when cancel Button is pressed. saves old session and closes
	 *              window.
	 */
	@FXML
	void HandleCancelButton(ActionEvent event) {

		interaction.saveSession(previousSession);
		Stage stage = (Stage) endTF.getScene().getWindow();
		stage.close();
	}

	/**
	 * @param event runs when OK Button is pressed. shows alert if no customer is
	 *              selected in combo box. Different code runs based on if trying to
	 *              register or unregister.
	 */
	@FXML
	void HandleOKButton(ActionEvent event) {
		Alert errorAlert = new Alert(Alert.AlertType.WARNING);

		if (CustomerDrop.getSelectionModel().isEmpty()) { // Make selecting a Customer mandatory
			errorAlert.setTitle("No customer Selected");
			errorAlert.setContentText("Please Select a customer to register to this session");
			errorAlert.showAndWait();
		} else if (memberEditLabel.getText().startsWith("Remove")) { // This code will run if trying to Un-Register
																		// Session
			Session session = new Session();

			session.setName(nameTF.getText());
			session.setSessionId(Integer.parseInt(IdTF.getText()));
			session.setCoach(coach);
			session.setPrice(Double.parseDouble(priceTF.getText()));
			session.setStartDate(startDP.getValue());
			session.setEndDate(endDP.getValue());
			String[] startTime = startTF.getText().split(":");
			session.setStartTime(LocalTime.of(Integer.parseInt(startTime[0]), Integer.parseInt(startTime[1]),
					Integer.parseInt(startTime[2])));
			String[] endTime = endTF.getText().split(":");
			session.setEndTime(LocalTime.of(Integer.parseInt(endTime[0]), Integer.parseInt(endTime[1]),
					Integer.parseInt(endTime[2])));

			for (int i = 0; i < previousCustomers.size(); i++) {
				if (previousCustomers.get(i).getName().equals(CustomerDrop.getValue().getName())) {
					previousCustomers.remove(i);
				}
			}
			// only show registered customers
			session.setCustomers(previousCustomers);

			interaction.saveSession(session);
			Stage stage = (Stage) endTF.getScene().getWindow();
			stage.close();
		} else { // This code will run if trying to Register Session

			Session session = new Session();

			session.setName(nameTF.getText());
			session.setSessionId(Integer.parseInt(IdTF.getText()));
			session.setCoach(coach);
			session.setPrice(Double.parseDouble(priceTF.getText()));
			session.setStartDate(startDP.getValue());
			session.setEndDate(endDP.getValue());
			String[] startTime = startTF.getText().split(":");
			session.setStartTime(LocalTime.of(Integer.parseInt(startTime[0]), Integer.parseInt(startTime[1]),
					Integer.parseInt(startTime[2])));
			String[] endTime = endTF.getText().split(":");
			session.setEndTime(LocalTime.of(Integer.parseInt(endTime[0]), Integer.parseInt(endTime[1]),
					Integer.parseInt(endTime[2])));

			if (!previousCustomers.contains(CustomerDrop.getValue()))
				previousCustomers.add(CustomerDrop.getValue());
			session.setCustomers(previousCustomers);

			interaction.saveSession(session);
			Stage stage = (Stage) endTF.getScene().getWindow();
			stage.close();
		}

	}

	/**
	 * @param session Fills fields with data from Session object provided during
	 *                Registration process. removes already registered customers
	 *                from observable list
	 */
	public void setFormValuesRegister(Session session) {
		previousSession = session;
		previousCustomers = session.getCustomers();

		nameTF.setText(session.getName());
		priceTF.setText(String.valueOf(session.getPrice()));
		IdTF.setText(String.valueOf(session.getSessionId()));
		startDP.setValue(session.getStartDate());
		endDP.setValue(session.getEndDate());
		CoachNameTF.setText(session.getCoach().toString());

		coach = session.getCoach();

		CustomerSessionOL = FXCollections.observableArrayList(ClubAppRepository.getCustomers());
		ObservableList<Customer> previousOL = FXCollections.observableArrayList(previousCustomers);

		// removes already registered customers from observable list.
		try {
			for (int i = 0; i < CustomerSessionOL.size(); i++) {
				for (int j = 0; j < previousOL.size(); j++) {
					if (previousOL.get(j).getMemberId() == CustomerSessionOL.get(i).getMemberId()) {
						CustomerSessionOL.remove(i);
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedDateTime1 = session.getStartTime().format(formatter);
		String formattedDateTime2 = session.getEndTime().format(formatter);
		startTF.setText(formattedDateTime1);
		endTF.setText(formattedDateTime2);
		CustomerDrop.setItems(CustomerSessionOL);
	}

	/**
	 * @param session Fills fields with data from Session object provided during
	 *                UnRegistration process
	 */
	public void setFormValuesUnRegister(Session session) {
		previousSession = session;
		previousCustomers = session.getCustomers();
		ObservableList<Customer> previousOL = FXCollections.observableArrayList(previousCustomers);
		CustomerDrop.setItems(previousOL);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedDateTime1 = session.getStartTime().format(formatter);
		String formattedDateTime2 = session.getEndTime().format(formatter);
		startTF.setText(formattedDateTime1);
		endTF.setText(formattedDateTime2);
		nameTF.setText(session.getName());
		priceTF.setText(String.valueOf(session.getPrice()));
		IdTF.setText(String.valueOf(session.getSessionId()));
		startDP.setValue(session.getStartDate());
		endDP.setValue(session.getEndDate());
		CoachNameTF.setText(session.getCoach().toString());

		coach = session.getCoach();
	}

	/**
	 * @param string sets main heading to the string provided
	 */
	public void setMemberEditLabel(String string) {
		memberEditLabel.setText(string);
	}

	/**
	 * method of interface Initializable. runs when window is launched.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
