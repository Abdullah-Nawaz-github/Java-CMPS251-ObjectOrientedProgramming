package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.controller.CustomerEditorController.AddCustomerInteraction;
import application.model.Coach;
import application.model.Customer;
import application.model.Type;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
/**
 * @author Sarim Toqeer - 202008545
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class used to control CoachEditorView.fxml which is used for adding
 *       and updating Coaches.
 * 
 */
public class CoachEditorController implements Initializable{
	/**
	 *       Interface used to link main Coach View with Coach Editor (add and
	 *       update)
	 */
	public interface AddCoachInteraction {
		/**
		 * @param Coach
		 * 
		 *                 method that will be used in CoachViewController.java
		 *                 to save coach.
		 */
		public void saveCoach(Coach coach);
	}

	private AddCoachInteraction interaction;
	/**
	 * @param interaction used to set interaction
	 */
	public void setInteraction(AddCoachInteraction interaction) {
		this.interaction = interaction;
	}
	/**
	 * Contains data of Coach that was removed from tableView when update
	 * Coach process was being done. Use this data to add that Coach back into
	 * the tableview if cancel button is pressed.
	 */
	Coach previousCoach=null;

	/**
	 * Label for heading of window. changes to "Add" or "Update" depending on
	 * process
	 */
    @FXML
    private Label memberEditLabel;
	/**
	 * Button to add Coach with data entered by user
	 */
    @FXML
    private Button okButton;
	/**
	 * Button to cancel the process of adding Coach 
	 */
    @FXML
    private Button cancelButton;
	/**
	 * Text Field for ID
	 */
    @FXML
    private TextField idTF;
	/**
	 * Text Field for name
	 */
    @FXML
    private TextField nameTF;
	/**
	 * Text Field for mobile number
	 */
    @FXML
    private TextField mobileTF;
	/**
	 * Text Field for nationality
	 */
    @FXML
    private TextField nationalityTF;
	/**
	 * Radio button for male gender
	 */
    @FXML
    private RadioButton maleRadio;
	/**
	 * Toggle Group for gender. Makes sure that only one radio button is pressed
	 */
    @FXML
    private ToggleGroup gender;
	/**
	 * Radio button for female gender
	 */
    @FXML
    private RadioButton femaleRadio;
	/**
	 * date selector
	 */
    @FXML
    private DatePicker dateSel;
	/**
	 * Text Field for salary
	 */
    @FXML
    private TextField salaryTF;
	/**
	 * Text Field for speciality
	 */
    @FXML
    private TextField specialityTF;
	/**
	 * Text Field for overtime
	 */
    @FXML
    private TextField overtimeTF;
	/**
	 * @param event closes current window and adds old coach back if update
	 *              process is being done.
	 */
    @FXML
    void HandleCancelButton(ActionEvent event) {
		if(memberEditLabel.getText().startsWith("Update"))
			interaction.saveCoach(previousCoach);

    	Stage stage = (Stage) idTF.getScene().getWindow();
		stage.close();
    }
	/**
	 * @param event creates new Coach and sets attributes based on data entered
	 *              by the user. use interaction to save Coach. Closes stage
	 */
    @FXML
    void HandleOKButton(ActionEvent event) {
    	Coach coach = new Coach();
    	coach.setMemberId(Integer.parseInt(idTF.getText()));
    	coach.setName(nameTF.getText());
    	coach.setMobileNo(mobileTF.getText());
    	coach.setNationality(nationalityTF.getText()); 
    	coach.setHiredate(dateSel.getValue());
    	coach.setSalary(Double.parseDouble(salaryTF.getText()));
    	coach.setSpeciality(specialityTF.getText());
    	coach.setOverTime(Double.parseDouble(overtimeTF.getText()));

		RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
		String genderGroupValue = selectedRadioButton.getText();
		coach.setGender(genderGroupValue);

		interaction.saveCoach(coach);
		
		Stage stage = (Stage) idTF.getScene().getWindow();
		stage.close();
    }
	/**
	 * @param coach Fills fields with data from Coach object provided.
	 */
    public void setFromValues(Coach coach) {
    	previousCoach=coach;
		memberEditLabel.setText("Update Coach");
		idTF.setText("" + coach.getMemberId());
		nameTF.setText(coach.getName());
		mobileTF.setText(coach.getMobileNo());
		nationalityTF.setText(coach.getNationality());
		if (coach.getGender().equals("Male"))
			maleRadio.setSelected(true);
		else
			femaleRadio.setSelected(true);
		dateSel.setPromptText("" + coach.getHiredate());
		salaryTF.setText("" + coach.getSalary());
		specialityTF.setText(coach.getSpeciality());
		overtimeTF.setText("" + coach.getOverTime());

	}
	/**
	 * @param event method of interface Initializable. runs when window is launched.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		memberEditLabel.setText("Add Coach");
	}

}
