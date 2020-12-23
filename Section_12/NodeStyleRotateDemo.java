// Example for PPT Page No.13
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class NodeStyleRotateDemo extends Application
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a scene and place a button in it
		StackPane pane=new StackPane();
		Button button=new Button("OK");
				
		// Set the style of the button
		button.setStyle("-fx-border-color:blue;");
		
		pane.getChildren().add(button);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color:red; -fx-background-color:lightgray;");
		
		Scene scene=new Scene(pane,300,300);
		
		primaryStage.setTitle("Node Style Rotate Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}