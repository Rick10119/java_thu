// Example for PPT Page No.22
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;

public class ShowBorderPane extends Application
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a border pane
		BorderPane pane=new BorderPane();
		
		// Place nodes in the pane
		pane.setTop(new CustomPane("top"));
		pane.setRight(new CustomPane("right"));
		pane.setBottom(new CustomPane("bottom"));
		pane.setLeft(new CustomPane("left"));
		pane.setCenter(new CustomPane("center"));
		
		// Create a scene and place it in the stage
		Scene scene=new Scene(pane);
		primaryStage.setTitle("Show BorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane
{
	public CustomPane(String title)
	{
		getChildren().add(new Label(title));
		setStyle("-fx-border-color: red");
		setPadding(new Insets(10,10,10,10));
	}
}