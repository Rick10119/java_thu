import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class HW5 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the circle
        Pane pane = new StackPane();
        pane.setPadding(new Insets(20, 20, 20, 20));

        // Create a rectangle and set its properties
        double length = 122;
        Rectangle shape1 = new Rectangle(0, 0, length, length);
        shape1.setStroke(Color.GREEN);
        shape1.setFill(Color.GREEN);
        pane.getChildren().add(shape1);

        Text text1 = new Text(30, 30, "GO");
        text1.setFont(Font.font("Times New Roman", 30));
        text1.setFill(Color.WHITE);
        pane.getChildren().add(text1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("HW5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

