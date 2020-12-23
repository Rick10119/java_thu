// Example for PPT Page No.21
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ShowGridPane extends Application
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a pane and set its properties
		GridPane pane=new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		// Place nodes in the pane
		pane.add(new Label("First Name:"),0,0);
		pane.add(new TextField(),1,0);
		pane.add(new Label("MI:"),0,1);
		pane.add(new TextField(),1,1);
		pane.add(new Label("Last Name:"),0,2);
		pane.add(new TextField(),1,2);
		Button button=new Button("Add Name");
		pane.add(button,1,3);
		pane.setHalignment(button,HPos.RIGHT);
		
		// Create a scene and place it in the stage
		Scene scene=new Scene(pane);
		primaryStage.setTitle("Show GridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}