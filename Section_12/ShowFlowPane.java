// Example for PPT page No.20
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class ShowFlowPane extends Application
{
	@Override //Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a pane and set its properties
		FlowPane pane=new FlowPane();
		pane.setPadding(new Insets(10,10,10,10));
		pane.setHgap(5);
		pane.setVgap(5);
		
		// Place nodes in the pane
		pane.getChildren().addAll(new Label("First Name:"),new TextField());
		pane.getChildren().add(new Label("MI:"));
		
		TextField tf=new TextField();
		tf.setPrefColumnCount(1);
		pane.getChildren().addAll(tf,new Label("Last Name:"),new TextField());
		
		// Create a scene and place it in the stage
		Scene scene=new Scene(pane);
		primaryStage.setTitle("Show FlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}