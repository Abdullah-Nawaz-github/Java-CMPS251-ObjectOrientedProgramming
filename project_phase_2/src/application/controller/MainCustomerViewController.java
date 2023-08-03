package application.controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import application.model.Customer;
import application.model.Member;
import application.controller.CustomerEditorController.AddCustomerInteraction;
import application.model.ClubAppRepository;
import application.model.Type;
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
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class that controlls MainCustomerView.fxml and allows users to add,
 *       update, delete, and save Customer objects
 * 
 */
public class MainCustomerViewController implements Initializable, AddCustomerInteraction {
	/**
	 * javafx Parent
	 */
	Parent root;

	/**
	 * javafx scene
	 */
	Scene scene;

	/**
	 * ObservableList of type Customer which is used to display customers in
	 * tableview
	 */
	private ObservableList<Customer> customersOL = null;

	/**
	 * Button to launch add Customer window
	 */
	@FXML
	private Button addCustomerButton;

	/**
	 * Table View that displays Customer objects with all attributes
	 */
	@FXML
	private TableView<Customer> customerTableView;

	/**
	 * Button to delete Customer at selected index
	 */
	@FXML
	private Button deleteCustomerButton;

	/**
	 * Column in Table View that displays discount
	 */
	@FXML
	private TableColumn<Customer, Double> discountCol;

	/**
	 * Column in Table View that displays gender
	 */
	@FXML
	private TableColumn<Customer, String> genderCol;

	/**
	 * Column in Table View that displays id
	 */
	@FXML
	private TableColumn<Member, Integer> idCol;

	/**
	 * Column in Table View that displays membership type
	 */
	@FXML
	private TableColumn<Customer, Type> membershipCol;

	/**
	 * Column in Table View that displays mobile no
	 */
	@FXML
	private TableColumn<Customer, String> mobileCol;

	/**
	 * Column in Table View that displays name
	 */
	@FXML
	private TableColumn<Customer, String> nameCol;

	/**
	 * Column in Table View that displays nationality
	 */
	@FXML
	private TableColumn<Customer, String> nationalityCol;

	/**
	 * Button to save Customer into file by calling method in ClubAppRepository.java
	 */
	@FXML
	private Button saveCustomerButton;

	/**
	 * Button to launch update Customer window
	 */
	@FXML
	private Button updateCustomerButton;

	/**
	 * @param event Runs when addCustomerButton is clicked. Launches window of
	 *              CustomerEditorView.fxml and allows user to add another customer
	 *              to the TableView
	 */
	@FXML
	void HandleAddCustomerButton(ActionEvent event) {
		try {
			URL url = getClass().getResource("/application/view/CustomerEditorView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			CustomerEditorController controller = loader.getController();
			controller.setInteraction(this);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Add Customer");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param event runs when deleteCustomerButton is clicked. gets selected index in
	 *              table view and deletes that customer from table view and data
	 *              file. Shows alerts for confirmation or if no Customer is
	 *              selected.
	 */
	@FXML
	void HandleDeleteCustomerButton(ActionEvent event) {

		Alert errorAlert = new Alert(Alert.AlertType.WARNING);
		Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
		int index = customerTableView.getSelectionModel().getSelectedIndex();

		if (customerTableView.getSelectionModel().isEmpty()) {
			errorAlert.setTitle("No customer Selected");
			errorAlert.setContentText("Please Select a customer to delete");
			errorAlert.showAndWait();
		} else {
			confirmationAlert.setTitle("Delete Confirmation");
			confirmationAlert.setContentText(
					"Do you want to delete customer with member id = " + customersOL.get(index).getMemberId());
			Optional<ButtonType> result = confirmationAlert.showAndWait();
			if (result.get() == ButtonType.OK) {
				customersOL.remove(index);
			} else {
				confirmationAlert.close();
			}

		}

	}

	/**
	 * @param event runs when saveCustomerButton is clicked. creates array of type
	 *              Customer and sets it equal to the customersOL Observable List.
	 *              Saves array in file using saveCustomers method from
	 *              ClubAppRepository.java.
	 */
	@FXML
	void HandleSaveCustomerButton(ActionEvent event) {
		Customer[] customerArray = customersOL.toArray(new Customer[customersOL.size()]);
		ClubAppRepository.saveCustomers(customerArray);

	}

	/**
	 * @param event runs when updateCustomerButton is clicked. gets index of
	 *              selected Customer in table view and opens a window of
	 *              CustomerEditorView.fxml. uses setFromValues method in
	 *              CustomerEditorController to fill values with attributes of
	 *              selected Customer.
	 */
	@FXML
	void HandleUpdateCustomerButton(ActionEvent event) {
		int index = customerTableView.getSelectionModel().getSelectedIndex();
		try {
			URL url = getClass().getResource("/application/view/CustomerEditorView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			CustomerEditorController controller = loader.getController();
			controller.setInteraction(this);
			controller.setFromValues(customersOL.get(index));
			customersOL.remove(index);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Update Customer");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * method of interface AddCustomerInteraction. adds Customer object to Customer
	 * Observable List.
	 */
	public void saveCustomer(Customer customer) {
		customersOL.add(customer);
	}

	/**
	 * method of interface Initializable. runs when window is launched. Link the
	 * customerTable columns with the Customer attributes. Set items of
	 * customerTableView
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Link the customerTable columns with the Customer attributes
		idCol.setCellValueFactory(new PropertyValueFactory<>("memberId"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		mobileCol.setCellValueFactory(new PropertyValueFactory<>("mobileNo"));
		nationalityCol.setCellValueFactory(new PropertyValueFactory<>("nationality"));
		genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
		membershipCol.setCellValueFactory(new PropertyValueFactory<>("memberShipType"));
		discountCol.setCellValueFactory(new PropertyValueFactory<>("discount"));
		// Convert the Customer list into ObservableList then pass it CustomerTable
		customersOL = FXCollections.observableArrayList(ClubAppRepository.getCustomers());
		customerTableView.setItems(customersOL);

	}

}
