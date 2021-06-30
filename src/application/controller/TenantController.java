package application.controller;

import application.entity.Tenant;
import application.service.TenantService;
import application.view.ViewManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TenantController implements Initializable {

  @FXML
  Button dashboardBtn = new Button();
  @FXML
  Button newTenant = new Button();

  @FXML
  public TextField id = new TextField();
  @FXML
  public TextField name = new TextField();
  @FXML
  public TextField surname = new TextField();
  @FXML
  public ComboBox<String> gender = new ComboBox<>();
  @FXML
  public TextField email = new TextField();
  @FXML
  public TextArea notes = new TextArea();
  @FXML
  public ListView<Tenant> tenantList = new ListView<>();
  @FXML
  public Button saveBtn = new Button();
  @FXML
  public Button cancelBtn = new Button();
  @FXML
  public Button deleteBtn = new Button();
  @FXML
  public Label errorText = new Label();

  private final TenantService tenantService = new TenantService();

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
  }


  @FXML
  public void dashboard() {
    ViewManager.getInstance().activateScene(ViewManager.getInstance().getScene_dashboardView());
  }

  @FXML
  public void createTenant(){
    tenantService.createUser(new Tenant("Herr", "Lyon", "Söte", "LyonSoete"));
    ViewManager.getInstance().activateScene(ViewManager.getInstance().getScene_addTenantView());
  }

}
