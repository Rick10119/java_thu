// Example for PPT Page No.25

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class MouseEventDemo extends Application 
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) 
	{
		// Create a pane and set its properties
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Programming is fun");
		pane.getChildren().addAll(text);
		pane.setOnMouseDragged(e ->
		{       
			text.setX(e.getX());
			text.setY(e.getY());
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("MouseEventDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
} 