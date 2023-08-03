package application.controller;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import application.controller.AddSessionViewController.AddSessionInteraction;
import application.controller.RegisterSessionViewController.RegisterSessionInteraction;
import application.model.ClubAppRepository;
import application.model.Customer;
import application.model.Session;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
/**
 * 
 * @author Muhammad Ahmed Yaqoob 201802799
 * @date 01/03/2023
 * @Version 1.0
 */
public class SessionViewController implements Initializable, AddSessionInteraction, RegisterSessionInteraction {
	/**
	 * Javafx root
	 */
	Parent root;
	/**
	 * Javafx scene
	 */
	Scene scene;
	/**
	 * ObservableList of type Session which is used to display Sessions in tableview
	 * 
	 */
	private ObservableList<Session> sessionsOL = null;
	/**
	 *  Table View that displays Session objects with all attributes
	 */
	@FXML
	private TableView<Session> SessionTableView;
	/**
	 * Button to launch add Session window
	 */
	@FXML
	private Button addSessionButton;
	/**
	 * Column in Table View that displays Caoach name
	 */
	@FXML
	private TableColumn<Session, String> coachCol;
	/**
	 * Column in Table View that displays Session ID
	 */
	@FXML
	private TableColumn<Session, Integer> idCol;
	/**
	 * Column in Table View that displays Customer 
	 */
	@FXML
	private TableColumn<Session, Customer> customerCol;
	/**
	 * Column in Table View that displays end date 
	 */
	@FXML
	private TableColumn<Session, LocalDate> enddateCol;
	/**
	 * Column in Table View that displays end time 
	 */
	@FXML
	private TableColumn<Session, LocalTime> endtimeCol;
	/**
	 * Column in Table View that displays session name 
	 */
	@FXML
	private TableColumn<Session, String> nameCol;
	/**
	 * Column in Table View that displays session price 
	 */
	@FXML
	private TableColumn<Session, Double> priceCol;
	/**
	 * Button to register Session 
	 */
	@FXML
	private Button registerSessionButton;
	/**
	 * Button to save Session 
	 */
	@FXML
	private Button saveSessionButton;
	/**
	 * Column in Table View that displays start date
	 */
	@FXML
	private TableColumn<Session, LocalDate> startdateCol;
	/**
	 * Column in Table View that displays start time
	 */
	@FXML
	private TableColumn<Session, LocalTime> starttimeCol;
	/**
	 * Button to UnRegister Session 
	 */
	@FXML
	private Button unregisterSessionButton;
	/**
	 * @param event Runs when AddSessionButton is clicked. Launches window of
	 *              AddSessionView.fxml and allows user to add another Session
	 *              to the TableView
	 */
	@FXML
	void HandleAddSessionButton(ActionEvent event) {
		try {
			URL url = getClass().getResource("/application/view/AddSessionView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			AddSessionViewController controller = loader.getController();
			controller.setInteraction(this);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Add Session");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * @param event runs when saveSessionButton is clicked. creates array of type
	 *              Session and sets it equal to the sessionsOL Observable List.
	 *              Saves array in file using saveSessions method from
	 *              ClubAppRepository.java.
	 */
	@FXML
	void HandleSaveSessionButton(ActionEvent event) {
		Session[] sessionArray = sessionsOL.toArray(new Session[sessionsOL.size()]);
		ClubAppRepository.saveSessions(sessionArray);

	}
	/**
	 * @param event runs when UnregisterSessionButton is clicked. Launches window of
	 *              RegisterSessionView.fxml and allows user to unregister customer from Session
	 *              to the TableView
	 */
	@FXML
	void HandleUnregisterSessionButton(ActionEvent event) {
		int index = SessionTableView.getSelectionModel().getSelectedIndex();
		try {
			URL url = getClass().getResource("/application/view/RegisterSessionView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			RegisterSessionViewController controller = loader.getController();
			controller.setInteraction(this);
			controller.setFormValuesUnRegister(sessionsOL.get(index));
			controller.setMemberEditLabel("Remove Customers from Session");
			sessionsOL.remove(index);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Remove Customers from Session");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param event runs when RegisterSessionButton is clicked. Launches window of
	 *              RegisterSessionView.fxml and allows user to register customer from Session
	 *              to the TableView
	 */
	@FXML
	void handleRegisterSessionButton(ActionEvent event) {
		int index = SessionTableView.getSelectionModel().getSelectedIndex();
		try {
			URL url = getClass().getResource("/application/view/RegisterSessionView.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			RegisterSessionViewController controller = loader.getController();
			controller.setInteraction(this);
			controller.setFormValuesRegister(sessionsOL.get(index));
			controller.setMemberEditLabel("Register Customers to Session");
			sessionsOL.remove(index);
			scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Register Customer to Session");
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * method of interface Initializable. runs when window is launched. Link the
	 * sessionTable columns with the Sessions attributes. Set items of
	 * SessionTableView
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Link the SessionTable columns with the Session attributes
		idCol.setCellValueFactory(new PropertyValueFactory<>("sessionId"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
		coachCol.setCellValueFactory(new PropertyValueFactory<>("coach"));
		customerCol.setCellValueFactory(new PropertyValueFactory<>("customers"));
		startdateCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
		enddateCol.setCellValueFactory(new PropertyValueFactory<>("endDate"));
		starttimeCol.setCellValueFactory(new PropertyValueFactory<>("startTime"));
		endtimeCol.setCellValueFactory(new PropertyValueFactory<>("endTime"));
		// Convert the Sessions list from repository into ObservableList then pass it SessionTable
		sessionsOL = FXCollections.observableArrayList(ClubAppRepository.getSessions());
		SessionTableView.setItems(sessionsOL);

	}
	/**
	 * method of interface AddSessionInteraction. adds Session object to Session
	 * Observable List.
	 */
	@Override
	public void saveSession(Session session) {
		sessionsOL.add(session);

	}

}
