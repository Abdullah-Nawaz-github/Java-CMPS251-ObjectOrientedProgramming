module project_phase_2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

	opens application to javafx.graphics, javafx.fxml;
	opens application.model to javafx.fxml;
	opens application.controller to javafx.fxml;

	exports application;
	exports application.model;
	exports application.controller;
}
