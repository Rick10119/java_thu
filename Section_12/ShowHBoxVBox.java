// Example for PPT Page No.23
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class ShowHBoxVBox extends Application
{
	@Override // Override the start method in Application class
	public void start(Stage primaryStage)
	{
		// Create a border pane
		BorderPane pane=new BorderPane();
		
		// Place nodes in the pane
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		// Create a scene and place it in the stage
		Scene scene=new Scene(pane);
		primaryStage.setTitle("Show HBox VBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private HBox getHBox()
	{
		HBox hBox=new HBox(15);
		hBox.setPadding(new Insets(15,15,15,15));
		hBox.setStyle("-fx-background-color:gold");
		hBox.getChildren().add(new Button("Computer Science"));
		hBox.getChildren().add(new Button("Chemistry"));
		
		ImageView imageView=new ImageView(new Image("image/china.gif"));
		imageView.setRotate(90);
		hBox.getChildren().add(imageView);
		
		return hBox;
	}
	
	private VBox getVBox()
	{
		VBox vBox=new VBox(15);
		vBox.setPadding(new Insets(15,15,15,15));
		vBox.getChildren().add(new Label("Courses"));
		
		Label[] courses={new Label("CSCI 1301"),new Label("CSCI 1302"),new Label("CSCI 2780"),new Label("CSCI 3531"),};
		
		for(Label course:courses)
		{
			vBox.setMargin(course,new Insets(0,0,0,25));
			vBox.getChildren().add(course);
		}
		
		return vBox;
	}
}