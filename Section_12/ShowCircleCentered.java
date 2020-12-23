// Example for PPT page No.10
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ShowCircleCentered extends Application
{
	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage)
	{
		// Create a pane
		Pane pane=new Pane();

		// Create a circle and set its properties
		Circle circle=new Circle();

		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));

		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.GREEN);
		
		// place the circle on the pane
		pane.getChildren().add(circle);
		
		// Create a scene and place it on the stage
		Scene scene=new Scene(pane,400,400);
		primaryStage.setTitle("Show Circle Centered");
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