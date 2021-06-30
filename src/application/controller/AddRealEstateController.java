package application.controller;

import application.view.ViewManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddRealEstateController {

	@FXML
	ComboBox objectType = new ComboBox();

	@FXML
	TextField adress = new TextField();

	@FXML
	TextField squareMeters = new TextField();

	@FXML
	TextField coldPrice = new TextField();

	@FXML
	TextField additionalCosts = new TextField();

	@FXML
	TextField notes = new TextField();

	@FXML
	Button addRealEstateBtn = new Button();



	@FXML
	public void addRealEstate() {
		ViewManager.getInstance().activateScene(ViewManager.getInstance().getScene_realEstateView());
	}

	@FXML
	public void cancel() {
		ViewManager.getInstance().activateScene(ViewManager.getInstance().getScene_realEstateView());
	}

}
