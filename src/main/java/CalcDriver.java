import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class CalcDriver extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	  public void start(Stage primaryStage) throws Exception {
	    Pane pane = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
	    Scene scene = new Scene(pane, 800, 800);
	    primaryStage.setScene(scene);
	    primaryStage.show();

	  }
	
	
}
