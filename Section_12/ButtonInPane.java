// Example for PPT page No.8
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application
{
	@Override // Override the start method in the Application class
	
	public void start(Stage primaryStage)
	{
		Button button=new Button("OK"); 	// Create a button
		StackPane pane=new StackPane();		// Create a pane
		pane.getChildren().add(button);		// Put the button in the pane
		Scene scene=new Scene(pane,250,200);// Create a scene and put the pane in it
		primaryStage.setTitle("Button in a pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/** The main method is only needed for the IDE with limited JavaFX support. 
		Not needed for running from the command line.
	*/
	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
}