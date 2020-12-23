// Example for PPT page No.9
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ShowCircle extends Application
{
	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage)
	{
		// Create a circle and set its properties
		Circle circle=new Circle();

		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		// Create a pane and hold the circle
		Pane pane=new Pane();
		pane.getChildren().add(circle);
		
		// Create a scene and place it on the stage
		Scene scene=new Scene(pane,200,200);
		primaryStage.setTitle("Show Circle");
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