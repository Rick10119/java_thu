// Example for PPT page No.6
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class MultipleStageDemo extends Application
{
	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage)
	{
		// Create a scene and place a button in the scene, put the scene in stage and show it
		Button buttonOK=new Button("OK");
		Scene scene=new Scene(buttonOK,250,200);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Create a new stage and put a new button in it
		Stage newStage=new Stage();
		newStage.setTitle("2nd stage");
		newStage.setScene(new Scene(new Button("another stage"),200,150));
		newStage.show();
	}
	
	/** The main method is only needed for the IDE with limited JavaFX support. 
		Not needed for running from the command line.
	*/
	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
}