// Example for PPT Page No.5, 32

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application 
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) 
	{
		// Create a pane 
		Pane pane = new Pane();
    
		// Add an image view and add it to pane
		ImageView imageView = new ImageView("image/china.gif");
		pane.getChildren().add(imageView);

		Line line=new Line(30,200,30,0);
		line.setStroke(new Color(0.8,0.8,0.8,1));
		line.setStrokeWidth(5);
		pane.getChildren().add(line);
    
		// Create a path transition 
		PathTransition pt = new PathTransition(Duration.millis(5000), new Line(100, 240, 100, 40), imageView);
		pt.setCycleCount(3);
		pt.play(); // Start animation 
    
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}