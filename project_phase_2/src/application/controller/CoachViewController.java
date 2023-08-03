package application.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import application.controller.CoachEditorController.AddCoachInteraction;
import application.model.ClubAppRepository;
import application.model.Coach;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
/**
 * @author Sarim Toqeer - 202008545
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class that controls CoachView.fxml and allows users to add,
 *       update, delete, and save Coach objects
 * 
 */

public class CoachViewController implements Initializable, AddCoachInteraction {
	/**
	 * javafx Parent
	 */
	Parent root;

	/**
	 * javafx scene
	 */
	Scene scene;
	/**
	 * ObservableList of type Coach which is used to display coaches in tableview
	 * 
	 */
	private ObservableList<Coach> coachOL = null;

	/**
	 * Button to launch add Coach window
	 */
	@FXML
    private Button addCoachButton;
	/**
	 * Button to launch update Coach window
	 */
    @FXML
    private Button updateCoachButton;
	/**
	 * Button to delete specific Coach 
	 */
    @FXML
    private Button deleteCoachButton;
	/**
	 * Button to save specific Coach
	 */
    @FXML
    private Button saveCoachButton;
	/**
	 *  Table View that displays Coach objects with all attributes
	 */
    @FXML
    private TableView<Coach> coachTableView;
	/**
	 * Column in Table View that displays ID
	 */
    @FXML
    private TableColumn<Coach, Integer> idCol;
	/**
	 * Column in Table View that displays name
	 */
    @FXML
    private TableColumn<Coach, String> nameCol;
	/**
	 * Column in Table View that displays mobile number
	 */
    @FXML
    private TableColumn<Coach, String> mobileCol;
	/**
	 * Column in Table View that displays nationality
	 */
    @FXML
    private TableColumn<Coach, String> nationalityCol;
	/**
	 * Column in Table View that displays gender
	 */
    @FXML
    private TableColumn<Coach, String> genderCol;
	/**
	 * Column in Table View that displays hire date
	 */
    @FXML
    private TableColumn<Coach, LocalDate> hiredateCol;
	/**
	 * Column in Table View that displays salary
	 */
    @FXML
    private TableColumn<Coach, Double> salaryCol;
	/**
	 * Column in Table View that displays speciality
	 */
    @FXML
    private TableColumn<Coach, String> specialityCol;
	/**
	 * Column in Table View that displays overtime
	 */
    @FXML
    private TableColumn<Coach, Double> overtimeCol;

	/**
	 * @param event Runs when addCoachButton is clicked. Launches window of
	 *              CaochEditorView.fxml and allows user to add another coach
	 *              to the TableView
	 */
    @FXML
    void HandleAddCoachButton(ActionEvent event) {
    	try {
			URL url = getClass().getResource("/application/view/CoachEditorView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			CoachEditorController controller = loader.getController();
			controller.setInteraction(this);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Add Coach");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	/**
	 * @param event runs when deleteCoachButton is clicked. gets selected index in
	 *              table view and deletes that coach from table view and data
	 *              file. Shows alerts for confirmation or if no coach is
	 *              selected.
	 */
    @FXML
    void HandleDeleteCoachButton(ActionEvent event) {
    	Alert errorAlert = new Alert(Alert.AlertType.WARNING);
		Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
		int index = coachTableView.getSelectionModel().getSelectedIndex();

		if (coachTableView.getSelectionModel().isEmpty()) {
			errorAlert.setTitle("No coach Selected");
			errorAlert.setContentText("Please Select a coach to delete");
			errorAlert.showAndWait();
		} else {
			confirmationAlert.setTitle("Delete Confirmation");
			confirmationAlert.setContentText(
					"Do you want to delete coach with member id = " + coachOL.get(index).getMemberId());
			Optional<ButtonType> result = confirmationAlert.showAndWait();
			if (result.get() == ButtonType.OK) {
				coachOL.remove(index);
			} else {
				confirmationAlert.close();
			}

		}
    }
	/**
	 * @param event runs when saveCoachButton is clicked. creates array of type
	 *              Coach and sets it equal to the coachOL Observable List.
	 *              Saves array in file using saveCoaches method from
	 *              ClubAppRepository.java.
	 */
    @FXML
    void HandleSaveCoachButton(ActionEvent event) {
    	Coach[] coachArray = coachOL.toArray(new Coach[coachOL.size()]);
		ClubAppRepository.saveCoaches(coachArray);
    }
	/**
	 * @param event runs when updateCoachButton is clicked. gets index of
	 *              selected coach in table view and opens a window of
	 *              CoachEditorView.fxml. uses setFromValues method in
	 *              CoachEditorController to fill values with attributes of
	 *              selected Coach.
	 */
    @FXML
    void HandleUpdateCoachButton(ActionEvent event) {
    	int index = coachTableView.getSelectionModel().getSelectedIndex();
		try {
			URL url = getClass().getResource("/application/view/CoachEditorView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			CoachEditorController controller = loader.getController();
			controller.setInteraction(this);
			controller.setFromValues(coachOL.get(index));
			coachOL.remove(index);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Update Coach");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	/**
	 * method of interface AddCoachInteraction. adds Coach object to Coach
	 * Observable List.
	 */
	@Override
	public void saveCoach(Coach coach) {
		coachOL.add(coach);		
	}
	/**
	 * method of interface Initializable. runs when window is launched. Link the
	 * coachTable columns with the Coach attributes. Set items of
	 * coachTableView
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Link the coachTable columns with the Coach attributes
		idCol.setCellValueFactory(new PropertyValueFactory<>("memberId"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		mobileCol.setCellValueFactory(new PropertyValueFactory<>("mobileNo"));
		nationalityCol.setCellValueFactory(new PropertyValueFactory<>("nationality"));
		genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
		hiredateCol.setCellValueFactory(new PropertyValueFactory<>("hiredate"));
		salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
		specialityCol.setCellValueFactory(new PropertyValueFactory<>("speciality"));
		overtimeCol.setCellValueFactory(new PropertyValueFactory<>("overTime"));
		// Convert the trips list into ObservableList then pass it tripsTable
		coachOL = FXCollections.observableArrayList(ClubAppRepository.getCoaches());
		coachTableView.setItems(coachOL);		
	}

}
