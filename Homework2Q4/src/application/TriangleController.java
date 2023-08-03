package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TriangleController {

	@FXML
	private TextField areaTF;

	@FXML
	private TextField baseTF;

	@FXML
	private Button calculateButton;

	@FXML
	private Button clearButton;

	@FXML
	private TextField heightTF;

	@FXML
	void calculateArea(ActionEvent event) {
		double base = Double.parseDouble(baseTF.getText());
		double height = Double.parseDouble(heightTF.getText());
		double area = 0.5 * base * height;
		areaTF.setText(String.format("%.3f", area));

	}

	@FXML
	void clearData(ActionEvent event) {
		baseTF.setText("");
		heightTF.setText("");
		areaTF.setText("");
	}

}
