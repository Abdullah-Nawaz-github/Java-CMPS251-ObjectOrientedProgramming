package application.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import application.controller.AdministratorEditorController.AddAdministratorInteraction;
import application.model.Administrator;
import application.model.ClubAppRepository;
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
 *       Class that controls AdministratorView.fxml and allows users to add,
 *       update, delete, and save Administrator objects
 * 
 */
public class AdministratorViewController implements Initializable, AddAdministratorInteraction {
	/**
	 * javafx Parent
	 */
	Parent root;

	/**
	 * javafx scene
	 */
	Scene scene;
	/**
	 * ObservableList of type Administrator which is used to display administrators in tableview
	 * 
	 */
	private ObservableList<Administrator> adminOL = null;
	/**
	 * Button to launch add Administrator window
	 */
    @FXML
    private Button addAdministratorButton;
	/**
	 * Button to launch update Administrator window
	 */
    @FXML
    private Button updateAdministratorButton;
	/**
	 * Button to launch delete Administrator 
	 */
    @FXML
    private Button deleteAdministratorButton;
	/**
	 * Button to save Administrator 
	 */
    @FXML
    private Button saveAdministratorButton;
	/**
	 *  Table View that displays Administrator objects with all attributes
	 */
    @FXML
    private TableView<Administrator> AdministratorTableView;
	/**
	 * Column in Table View that displays ID
	 */
    @FXML
    private TableColumn<Administrator, Integer> idCol;
	/**
	 * Column in Table View that displays name
	 */
    @FXML
    private TableColumn<Administrator, String> nameCol;
	/**
	 * Column in Table View that displays mobile number
	 */
    @FXML
    private TableColumn<Administrator, String> mobileCol;
	/**
	 * Column in Table View that displays nationality
	 */
    @FXML
    private TableColumn<Administrator, String> nationalityCol;
	/**
	 * Column in Table View that displays gender
	 */
    @FXML
    private TableColumn<Administrator, String> genderCol;
	/**
	 * Column in Table View that displays hire date
	 */
    @FXML
    private TableColumn<Administrator, LocalDate> hiredateCol;
	/**
	 * Column in Table View that displays salary
	 */
    @FXML
    private TableColumn<Administrator, Double> salaryCol;
	/**
	 * Column in Table View that displays jobtitle
	 */
    @FXML
    private TableColumn<Administrator, String>  jobtitleCol ;
	/**
	 * @param event Runs when addAdministratorButton is clicked. Launches window of
	 *              AdministratorEditorView.fxml and allows user to add another Administrator
	 *              to the TableView
	 */
    @FXML
    void HandleAddAdministratorButton(ActionEvent event) {
    	try {
			URL url = getClass().getResource("/application/view/AdministratorEditorView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			AdministratorEditorController controller = loader.getController();
			controller.setInteraction(this);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Add Administrator");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	/**
	 * @param event runs when deleteAdministratorButton is clicked. gets selected index in
	 *              table view and deletes that Administrator from table view and data
	 *              file. Shows alerts for confirmation or if no Administrator is
	 *              selected.
	 */
    @FXML
    void HandleDeleteAdministratorButton(ActionEvent event) {
    	Alert errorAlert = new Alert(Alert.AlertType.WARNING);
		Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
		int index = AdministratorTableView.getSelectionModel().getSelectedIndex();

		if (AdministratorTableView.getSelectionModel().isEmpty()) {
			errorAlert.setTitle("No Administrator Selected");
			errorAlert.setContentText("Please Select a Administrator to delete");
			errorAlert.showAndWait();
		} else {
			confirmationAlert.setTitle("Delete Confirmation");
			confirmationAlert.setContentText(
					"Do you want to delete Administrator with member id = " + adminOL.get(index).getMemberId());
			Optional<ButtonType> result = confirmationAlert.showAndWait();
			if (result.get() == ButtonType.OK) {
				adminOL.remove(index);
			} else {
				confirmationAlert.close();
			}
		}
    }
	/**
	 * @param event runs when saveAdministratorButton is clicked. creates array of type
	 *              Administrator and sets it equal to the adminOL Observable List.
	 *              Saves array in file using saveAdministrators method from
	 *              ClubAppRepository.java.
	 */
    @FXML
    void HandleSaveAdministratorButton(ActionEvent event) {
    	Administrator[] administratorArray = adminOL.toArray(new Administrator[adminOL.size()]);
		ClubAppRepository.saveAdministrators(administratorArray);
    }
	/**
	 * @param event runs when updateAdministratorButton is clicked. gets index of
	 *              selected Administrator in table view and opens a window of
	 *              AdministratorEditorView.fxml. uses setFromValues method in
	 *              AdministratorEditorController to fill values with attributes of
	 *              selected Administrator.
	 */
    @FXML
    void HandleUpdateAdministratorButton(ActionEvent event) {
    	int index = AdministratorTableView.getSelectionModel().getSelectedIndex();
		try {
			URL url = getClass().getResource("/application/view/AdministratorEditorView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			AdministratorEditorController controller = loader.getController();
			controller.setInteraction(this);
			controller.setFromValues(adminOL.get(index));
			adminOL.remove(index);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Update Administrator");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	/**
	 * method of interface AddAdministratorInteraction. adds Administrator object to Administrator
	 * Observable List.
	 */
	@Override
	public void saveAdministrator(Administrator administrator) {
		adminOL.add(administrator);			
	}
	/**
	 * method of interface Initializable. runs when window is launched. Link the
	 * administratorTable columns with the Administrator attributes. Set items of
	 * administratorTableView
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Link the administratorTable columns with the Administrator attributes
		idCol.setCellValueFactory(new PropertyValueFactory<>("memberId"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		mobileCol.setCellValueFactory(new PropertyValueFactory<>("mobileNo"));
		nationalityCol.setCellValueFactory(new PropertyValueFactory<>("nationality"));
		genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
		hiredateCol.setCellValueFactory(new PropertyValueFactory<>("hiredate"));
		salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
		jobtitleCol.setCellValueFactory(new PropertyValueFactory<>("jobTitle"));
		// Convert the trips list into ObservableList then pass it tripsTable
		adminOL = FXCollections.observableArrayList(ClubAppRepository.getAdministrator());
		AdministratorTableView.setItems(adminOL);		
	}

}
