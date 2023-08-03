package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.Customer;
import application.model.Type;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class used to controll CustomerEditorView.fxml which is used for adding
 *       and updating Customers.
 * 
 */
public class CustomerEditorController implements Initializable {

	/**
	 * @author Abdullah Nawaz 202108536
	 * @version 1.0
	 * @date 01/03/2023
	 * 
	 *       Interface used to link main Customer View with Customer Editor (add and
	 *       update)
	 *
	 */
	public interface AddCustomerInteraction {
		/**
		 * @param customer
		 * 
		 *                 method that will be used in MainCustomerViewController.java
		 *                 to save customer.
		 */
		public void saveCustomer(Customer customer);
	}

	private AddCustomerInteraction interaction;

	/**
	 * @param interaction used to set interaction
	 */
	public void setInteraction(AddCustomerInteraction interaction) {
		this.interaction = interaction;
	}

	/**
	 * Contains data of Customer that was removed from tableView when update
	 * Customer process was being done. Use this data to add that customer back into
	 * the tableview if cancel button is pressed.
	 */
	Customer previousCustomer;

	/**
	 * Radio button for Daily membership type
	 */
	@FXML
	private RadioButton dailyRadio;

	/**
	 * Text Field for discount
	 */
	@FXML
	private TextField discountTF;

	/**
	 * Radio button for female gender
	 */
	@FXML
	private RadioButton femaleRadio;

	/**
	 * Toggle Group for gender. Makes sure that only one radio button is pressed
	 */
	@FXML
	private ToggleGroup gender;

	/**
	 * Text Field for id
	 */
	@FXML
	private TextField idTF;

	/**
	 * Radio button for female gender
	 */
	@FXML
	private RadioButton maleRadio;

	/**
	 * Label for heading of window. changes to "Add" or "Update" depending on
	 * process
	 */
	@FXML
	private Label memberEditLabel;

	/**
	 * Text Field for mobile no
	 */
	@FXML
	private TextField mobileTF;

	/**
	 * Radio button for Monthly membership type
	 */
	@FXML
	private RadioButton monthlyRadio;

	/**
	 * Text Field for name
	 */
	@FXML
	private TextField nameTF;

	/**
	 * Text Field for nationality
	 */
	@FXML
	private TextField nationalityTF;

	/**
	 * Button to add Customer with data entered by user
	 */
	@FXML
	private Button okButton;

	/**
	 * Toggle Group for membership type. Makes sure that only one radio button is
	 * pressed
	 */
	@FXML
	private ToggleGroup type;

	/**
	 * Radio button for Yearly membership type
	 */
	@FXML
	private RadioButton yearlyRadio;

	/**
	 * @param event When monthlyRadio is selected, sets discount to 10.
	 */
	@FXML
	void HandleMonthlyRadio(ActionEvent event) {
		discountTF.setText("10");

	}

	/**
	 * @param event When dailyRadio is selected, sets discount to 0.
	 */
	@FXML
	void HandleDailyRadio(ActionEvent event) {
		discountTF.setText("0");

	}

	/**
	 * @param event When yearlyRadio is selected, sets discount to 20.
	 */
	@FXML
	void HandleYearlyRadio(ActionEvent event) {
		discountTF.setText("20");

	}

	/**
	 * @param event closes current window and adds old customer back if update
	 *              process is being done.
	 */
	@FXML
	void HandleCancelButton(ActionEvent event) {
		if (memberEditLabel.getText().startsWith("Update"))
			interaction.saveCustomer(previousCustomer);

		Stage stage = (Stage) idTF.getScene().getWindow();
		stage.close();

	}

	/**
	 * @param event creates new Customer and sets attributes based on data entered
	 *              by the user. use interaction to save Customer. Closes stage
	 */
	@FXML
	void HandleOKButton(ActionEvent event) {
		Customer customer = new Customer();
		try {
			customer.setMemberId(Integer.parseInt(idTF.getText()));
			customer.setName(nameTF.getText());
			customer.setMobileNo(mobileTF.getText());
			customer.setNationality(nationalityTF.getText());

			RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
			String genderGroupValue = selectedRadioButton.getText();
			customer.setGender(genderGroupValue);

			selectedRadioButton = (RadioButton) type.getSelectedToggle();
			customer.setMemberShipType((Type) selectedRadioButton.getUserData());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		interaction.saveCustomer(customer);
		Stage stage = (Stage) idTF.getScene().getWindow();
		stage.close();

	}

	/**
	 * @param customer Fills fields with data from Customer object provided.
	 */
	public void setFromValues(Customer customer) {
		previousCustomer = customer;
		memberEditLabel.setText("Update Member");
		try {
			idTF.setText("" + customer.getMemberId());
			nameTF.setText(customer.getName());
			mobileTF.setText(customer.getMobileNo());
			nationalityTF.setText(customer.getNationality());
			if (customer.getGender().equals("Male"))
				maleRadio.setSelected(true);
			else
				femaleRadio.setSelected(true);
			if (customer.getMemberShipType().equals(Type.Daily))
				dailyRadio.setSelected(true);
			else if (customer.getMemberShipType().equals(Type.Monthly))
				monthlyRadio.setSelected(true);
			else
				yearlyRadio.setSelected(true);
			discountTF.setText("" + customer.getDiscount());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param event method of interface Initializable. runs when window is launched.
	 *              sets data of radio buttons.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		memberEditLabel.setText("Add Member");
		yearlyRadio.setUserData(Type.Yearly);
		monthlyRadio.setUserData(Type.Monthly);
		dailyRadio.setUserData(Type.Daily);

	}
}
