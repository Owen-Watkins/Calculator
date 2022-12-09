import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * This class handles the Gui view for the calculator.
 *
 * @author Owen
 *
 */
public class CalcGuiView extends Application implements ViewInterface {

  @FXML
  private Button buttonCalculate = null;

  @FXML
  private RadioButton buttonRevPol;

  @FXML
  private GridPane gridPane;

  @FXML
  private TextField textField;

  private static volatile CalcGuiView instance = null;

  @FXML
  void initialize() {
    instance = this;
  }

  /**
   * Gets the instance of GuiView, or creates a new one.
   *
   * @return instance of CalcGuiView.
   */
  public static synchronized CalcGuiView getInstance() {
    if (instance == null) {
      new Thread(() -> Application.launch(CalcGuiView.class)).start();
      while (instance == null) {
      }
    }

    return instance;
  }

  @FXML
  void onCalculatePress(ActionEvent event) {

  }

  @FXML
  void onRevPolPress(ActionEvent event) {

  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Pane pane = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
    Scene scene = new Scene(pane, 800, 800);
    primaryStage.setScene(scene);
    primaryStage.show();

  }

  @Override
  public void addCalculateObserver(Observer c) {
    buttonCalculate.setOnAction(event -> c.notifyObservers());

  }

  @Override
  public String getUserInput() {
    return textField.getText();
  }

  @Override
  public void menu() {
    buttonCalculate.setDisable(false);

  }

  @Override
  public void setTotal(String value) {
    textField.setText(value);

  }

}
