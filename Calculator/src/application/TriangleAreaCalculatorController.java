package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TriangleAreaCalculatorController {
  
  // The input fields
  @FXML
  private TextField baseInput;
  @FXML
  private TextField heightInput;
  
  // The output field
  @FXML
  private TextField areaOutput;
  
  // The calculate button
  @FXML
  private Button calculateButton;
  
  // Calculate the triangle's area and display it in the output field
  @FXML
  public void calculateTriangleArea() {
    // Get the base and height values from the input fields
    double base = Double.parseDouble(baseInput.getText());
    double height = Double.parseDouble(heightInput.getText());
    
    // Calculate the area of the triangle
    double area = 0.5 * base * height;
    
    // Display the area in the output field
    areaOutput.setText(String.format("%.2f", area));
  }
}