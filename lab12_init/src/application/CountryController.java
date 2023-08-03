package application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class CountryController {

	@FXML
	private Label ContinentID;

	@FXML
	private ComboBox<String> RegionCombo;

	@FXML
	private Label RegionID;

	@FXML
	private TableColumn<Country, Double> areaCol;

	@FXML
	private TableColumn<Country, String> capitalCol;

	@FXML
	private TableColumn<Country, String> codeCol;

	@FXML
	private TableColumn<Country, String> continentCol;

	@FXML
	private ComboBox<String> continentCombo;

	@FXML
	private TableColumn<Country, String> nameCol;

	@FXML
	private TableColumn<Country, Long> populationCol;

	@FXML
	private TableColumn<Country, String> regionCol;

}
