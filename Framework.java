import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

class Framework extends Application{
	Button back = new Button("Back");
 	Button next = new Button("Next");
	GridPane pane = new GridPane();

  public void start(Stage primaryStage)
    {
      System.out.println("Just a fat test, wont hold the main function at the end");
    }
 
}
