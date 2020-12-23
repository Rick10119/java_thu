// Example for PPT page No.17
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class ShowImage extends Application
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a pane to hole the image views
		Pane pane=new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		
		String s="card/"+(int)(Math.random()*52+1)+".png";
		System.out.println(s);
		
		Image image=new Image(s);
		ImageView imageView1=new ImageView(image);
		pane.getChildren().add(imageView1);
		
		ImageView imageView2=new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);
		
		ImageView imageView3=new ImageView(image);
		imageView3.setRotate(90);
		pane.getChildren().add(imageView3);
		
		// Create a scene and place it in the stage
		Scene scene=new Scene(pane);
		primaryStage.setTitle("Show Image");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}