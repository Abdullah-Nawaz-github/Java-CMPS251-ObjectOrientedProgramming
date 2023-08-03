package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.Administrator;
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
 *       Class used to control AdministratorEditorView.fxml which is used for adding
 *       and updating Administrators.
 * 
 */
public class AdministratorEditorController implements Initializable{
	/**
	 *       Interface used to link main Administrators View with Administrator Editor (add and
	 *       update)
	 */
	public interface AddAdministratorInteraction {
		/**
		 * @param Administrator
		 * 
		 *                 method that will be used in AdministratorViewController.java
		 *                 to save Administrator.
		 */
		public void saveAdministrator(Administrator administrator);
	}
	/**
	 * @param interaction used to set interaction
	 */
	private AddAdministratorInteraction interaction;
	/**
	 * @param interaction used to set interaction
	 */
	public void setInteraction(AddAdministratorInteraction interaction) {
		this.interaction = interaction;
	}
	/**
	 * Contains data of Administrator that was removed from tableView when update
	 * Coach process was being done. Use this data to add that Coach back into
	 * the tableview if cancel button is pressed.
	 */
	Administrator previousAdmin;
	/**
	 * Label for heading of window. changes to "Add" or "Update" depending on
	 * process
	 */
    @FXML
    private Label memberEditLabel;
	/**
	 * Button to add Administrator with data entered by user
	 */
    @FXML
    private Button okButton;
	/**
	 * Button to cancel the process of adding Administrator 
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
	 * Text Field for jobtitle
	 */
    @FXML
    private TextField jobtitleTF;
	/**
	 * @param event closes current window and adds old Administrator back if update
	 *              process is being done.
	 */
    @FXML
    void HandleCancelButton(ActionEvent event) {
    	if(memberEditLabel.getText().startsWith("Update"))
    		interaction.saveAdministrator(previousAdmin);

    	Stage stage = (Stage) idTF.getScene().getWindow();
		stage.close();
    }
	/**
	 * @param event creates new Administrator and sets attributes based on data entered
	 *              by the user. use interaction to save Administrator. Closes stage
	 */
    @FXML
    void HandleOKButton(ActionEvent event) {
    	Administrator administrator = new Administrator();
    	
    	administrator.setMemberId(Integer.parseInt(idTF.getText()));
    	administrator.setName(nameTF.getText());
    	administrator.setMobileNo(mobileTF.getText());
    	administrator.setNationality(nationalityTF.getText()); 
    	administrator.setHiredate(dateSel.getValue());
    	administrator.setSalary(Double.parseDouble(salaryTF.getText()));
    	administrator.setJobTitle(jobtitleTF.getText());

		RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
		String genderGroupValue = selectedRadioButton.getText();
		administrator.setGender(genderGroupValue);

		interaction.saveAdministrator(administrator);
		Stage stage = (Stage) idTF.getScene().getWindow();
		stage.close();
    }
	/**
	 * @param Administrator Fills fields with data from Administrator object provided.
	 */
    public void setFromValues(Administrator administrator) {
    	previousAdmin=administrator;
		memberEditLabel.setText("Update Administrator");
		
		idTF.setText("" + administrator.getMemberId());
		nameTF.setText(administrator.getName());
		mobileTF.setText(administrator.getMobileNo());
		nationalityTF.setText(administrator.getNationality());
		if (administrator.getGender().equals("Male"))
			maleRadio.setSelected(true);
		else
			femaleRadio.setSelected(true);
		dateSel.setPromptText("" + administrator.getHiredate());
		salaryTF.setText("" + administrator.getSalary());
		jobtitleTF.setText(administrator.getJobTitle());

	}
	/**
	 * @param event method of interface Initializable. runs when window is launched.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		memberEditLabel.setText("Add Administrator");
	}

}